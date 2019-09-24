package GUI;

import java.awt.EventQueue;
import java.awt.GridLayout;


import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import EntidadGrafica.ElementoGrafico;
import Juego.Controlador;
import Juego.Jugador;
import Personajes.*;

public class GUI extends JFrame implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;

	private JLabel dibujo;
	private Mapa mapa;
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
		mapa= new Mapa(this);
		controlador = new Controlador(this,mapa,new Jugador());
		tiempo= new ContadorTiempo(controlador,this);
		addKeyListener(this);
		setearVentana();
		setearPanelPrincipal();
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
		getContentPane().add(mapa);
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
			controlador.comprarTorre(e.getX(), e.getY());
		}
		else
			controlador.colocarEnemigo(mapa.getWidth(), e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyChar()=='k')
			mapa.genocidio();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
	
	

	
}
//setbound
//setlocation