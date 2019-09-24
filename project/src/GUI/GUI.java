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
	private JPanel principal;
	private ContadorTiempo tiempo;
	private Controlador controlador;
	
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);
	/*	EventQueue.invokeLater(new Runnable(){
			public void run() {
			}
		}
		);
		*/
	}
		
	public GUI() {
		
		controlador = new Controlador(this);
		
		tiempo= new ContadorTiempo(controlador,this);

		setearVentana();
		setearPanelPrincipal();
		
		agregarDibujo();
		
		tiempo.start();
	}
	
	private void setearVentana() {
		getContentPane().setLayout(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 0, 1028, 768);//esto quedo asi porque con 1024 no se ve el borde
	}
	
	private void setearPanelPrincipal() {
		principal=new JPanel();
		principal.setLayout(null);
		principal.setVisible(true);
		principal.setOpaque(false);
		getContentPane().add(principal);
		principal.setBounds(0, 0, 1028, 576);//esto quedo asi porque con 1024 no se ve el borde


	}
	
	private void agregarDibujo(){
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Sprites/sueloMapa.png"));
		dibujo = new JLabel(imagen);
		dibujo.setOpaque(false);
		getContentPane().add(dibujo);
		dibujo.setBounds(0, 0,1024,576);
		dibujo.addMouseListener(this);
	}
	
	public void añadir(ElementoGrafico e) {
		principal.add(e);
		int x = e.getX();
		int y = e.getY();
		System.out.println(x+" -aca- "+y);
		e.setBounds(x,y,e.getAlto(),e.getAncho());
		principal.setComponentZOrder(e, 0);
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
	/*	if(e.getButton()==MouseEvent.BUTTON1) {
			controlador.comprarTorre(e.getX(), e.getY());
		}
	//	else
		//	controlador.remover();
		 */
		controlador.comprarTorre(e.getX(), e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void remover(ElementoGrafico obj) {
		principal.remove(obj);
	}
	

	
}
//setbound
//setlocation