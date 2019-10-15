package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidad.Elemento;
import EntidadGrafica.ElementoGrafico;
import Juego.Controlador;
import Juego.Jugador;
import Personajes.*;
import Tienda.Tienda;

public class GUI extends JFrame implements MouseListener{
	private static final long serialVersionUID = 1L;

	private ContadorTiempo tiempo;
	private Controlador controlador;
	protected List<ElementoGrafico>[] entidades;
	protected ImageIcon fondo;
	protected JPanel panelJuego;
	protected Tienda tienda;

	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);
	}

	public GUI() {
		// mapa= new Mapa(this);
		Jugador jugador = new Jugador();
		tienda = new Tienda(jugador);
		controlador = new Controlador(this,new Mapa(this), jugador,tienda);
		tiempo = new ContadorTiempo(controlador, this);
		addMouseListener(this);
		setearVentana();
		setearPanelJuego();
		agregarPanelTienda();

		tiempo.start();
		for (int i=0; i<6;i++) {
			controlador.colocarEnemigo(918+100, i*96);
			controlador.colocarEnemigo(918+100, i*96);
		}
		
		controlador.colocarPiedra(306, 96);
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// System.out.println("x :"+e.getX()+"y: "+e.getY());
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
		/*if (e.getButton() == MouseEvent.BUTTON1) {
			controlador.comprarTorre(e.getX(), e.getY());
		} else
			controlador.colocarEnemigo(getWidth(), e.getY());*/
		controlador.click(e.getX(),e.getY());

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}


	private void setearVentana() {
		getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1028, 768);// esto quedo asi porque con 1024 no se ve el borde
	}
	
	private void agregarPanelTienda() {
		getContentPane().add(tienda);
	}

	@SuppressWarnings("unchecked")
	private void setearPanelJuego() {
		panelJuego = new JPanel();
		panelJuego.setLayout(null);
		panelJuego.setVisible(true);
		panelJuego.setOpaque(false);
		panelJuego.setPreferredSize(new Dimension( 1028, 640));// esto quedo asi porque con 1024 no se ve el borde
		agregarFondo();
		this.add(panelJuego);
		repaint();
	}

	private void agregarFondo() {
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Sprites/sueloMapa.png"));
		JLabel dibujo = new JLabel(imagen);
		dibujo.setOpaque(false);
		add(dibujo);
		dibujo.setSize( 1024, 576);
		
		panelJuego.add(dibujo);
	}

	public synchronized void añadirElemento(Elemento e) {
		ElementoGrafico grafico = e.obtenerGrafico();
		panelJuego.add(grafico);
		int x = grafico.getX();
		int y = grafico.getY();
		grafico.setBounds(x, y, grafico.getAlto(), grafico.getAncho());
		panelJuego.setComponentZOrder(grafico, 0);
	}

	public void eliminar(Elemento e) {
		panelJuego.remove(e.obtenerGrafico());
		panelJuego.repaint();
		repaint();
	}


}
//setbound
//setlocation