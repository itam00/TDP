package GUI;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import EntidadGrafica.ElementoGrafico;
import Juego.Controlador;
import Personajes.*;

public class GUI extends JFrame implements MouseListener{
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel dibujo;
	private ContadorTiempo tiempo;
	private Controlador controlador;
	
	private int posY,posX;
	
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);
		EventQueue.invokeLater(new Runnable(){
			public void run() {
			}
		}
		);
	}
		
	public GUI() {
		posX=0;
		posY=0;
		
		controlador = new Controlador(this);
		tiempo= new ContadorTiempo(controlador,this);
		
		
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		this.setResizable(false);
			
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 0, 1028, 768);//esto quedo asi porque con 1024 no se ve el borde

		agregarDibujo();

			
		this.setVisible(true);
		this.setResizable(false);
		
		tiempo.start();

	}
		
	
	private void agregarDibujo(){
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Sprites/sueloMapa.png"));
		dibujo = new JLabel(imagen);
		dibujo.setOpaque(false);
		contentPane.add(dibujo);
		dibujo.setBounds(0, 0,1024,576);
		dibujo.addMouseListener(this);

	}
	
	public void añadir(ElementoGrafico e) {
		contentPane.add(e);
		int x = (int)(e.getX());
		int y = (int)(e.getY());
		System.out.println(x+"   "+y);
		e.setBounds(x,y,x+e.getAlto(),e.getAncho());
		contentPane.setComponentZOrder(e, 0);
	}
		

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("x :"+e.getX()+"y: "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			posX = (int) (e.getX()/102.4);
			posY = (int) (e.getY()/96);
			controlador.comprarTorre(posX, posY);
		}
	//	else
		//	controlador.remover();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	/*public void remover(ElementoGrafico obj) {
		contentPane.remove(obj);
	}*/
	

	
}
//setbound
//setlocation