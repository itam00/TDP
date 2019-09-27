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

import Entidad.Elemento;
import EntidadGrafica.ElementoGrafico;
import Juego.Controlador;
import Juego.Jugador;
import Personajes.*;

public class GUI extends JFrame implements MouseListener, KeyListener {
	private static final long serialVersionUID = 1L;

	private ContadorTiempo tiempo;
	private Controlador controlador;
	protected List<ElementoGrafico>[] entidades;
	protected ImageIcon fondo;
	protected JPanel panelJuego;

	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);
	}

	public GUI() {
		// mapa= new Mapa(this);
		controlador = new Controlador(this, new Jugador());
		tiempo = new ContadorTiempo(controlador, this);
		addKeyListener(this);
		addMouseListener(this);
		setearVentana();
		setearPanelJuego();

		tiempo.start();

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
		if (e.getButton() == MouseEvent.BUTTON1) {
			controlador.comprarTorre(e.getX(), e.getY());
		} else
			controlador.colocarEnemigo(getWidth(), e.getY());

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyChar() == 'k')
			controlador.genocidio();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

	private void setearVentana() {
		getContentPane().setLayout(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 0, 1028, 768);// esto quedo asi porque con 1024 no se ve el borde
	}

	@SuppressWarnings("unchecked")
	private void setearPanelJuego() {
		panelJuego = new JPanel();
		panelJuego.setLayout(null);
		panelJuego.setVisible(true);
		panelJuego.setOpaque(false);
		this.add(panelJuego);
		panelJuego.setBounds(0, 0, 1028, 576);// esto quedo asi porque con 1024 no se ve el borde
		agregarFondo();
		repaint();
	}

	private void agregarFondo() {
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Sprites/sueloMapa.png"));
		JLabel dibujo = new JLabel(imagen);
		dibujo.setOpaque(false);
		add(dibujo);
		dibujo.setBounds(0, 0, 1024, 576);
		panelJuego.add(dibujo);
	}

	public void añadirElemento(Elemento e) {
		ElementoGrafico grafico = e.obtenerGrafico();
		panelJuego.add(grafico);
		int x = grafico.getX();
		int y = grafico.getY();
		System.out.println(x + " -aca- " + y);
		grafico.setBounds(x, y, grafico.getAlto(), grafico.getAncho());
		panelJuego.setComponentZOrder(grafico, 0);
	}

	public void eliminar(Elemento e) {
		panelJuego.remove(e.obtenerGrafico());
		panelJuego.repaint();
		repaint();
	}

	public boolean coincidePosicion(Elemento e1, Elemento e2) {
		ElementoGrafico grafico1 = e1.obtenerGrafico();
		ElementoGrafico grafico2 = e2.obtenerGrafico();
		System.out.println(grafico1.getX()+"    "+grafico2.getX());
		return  (grafico1.getX() == grafico2.getX()) && (grafico1.getY() == grafico2.getY());
	}

}
//setbound
//setlocation