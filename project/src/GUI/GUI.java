package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Entidad.Elemento;
import Graficos.ElementoGrafico;
import Juego.Controlador;
import Juego.Jugador;
import Juego.Mapa;
import Tienda.Tienda;

public class GUI extends JFrame implements MouseListener{
	private static final long serialVersionUID = 1L;

	private ContadorTiempo tiempo;
	private Controlador controlador;
	protected List<ElementoGrafico>[] entidades;
	protected ImageIcon fondo;
	protected JPanel panelJuego,panelUtilidades;
	protected Tienda tienda;
	protected Jugador jugador;

	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);
	}

	public GUI() {
		jugador = new Jugador();
		tienda = new Tienda(jugador);
		Mapa mapa= new Mapa(this,tienda);
		controlador = new Controlador(this,mapa, jugador,tienda);
		tiempo = new ContadorTiempo(controlador);
		addMouseListener(this);
		setearVentana();
		setearPanelJuego();
		setearPanelUtilidades();

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
	public synchronized void mousePressed(MouseEvent e) {
		controlador.click(e.getX(),e.getY());

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}


	private void setearVentana() {
		getContentPane().setLayout(null);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1028, 768);// esto quedo asi porque con 1024 no se ve el borde
	}
	


	private void setearPanelJuego() {
		panelJuego = new JPanel();
		panelJuego.setLayout(null);
		panelJuego.setVisible(true);
		panelJuego.setOpaque(false);
		//panelJuego.setPreferredSize(new Dimension( 1028, 640));// esto quedo asi porque con 1024 no se ve el borde
		agregarFondo();
		panelJuego.setBounds(0,0,1028,640);
		this.add(panelJuego);
		repaint();
	}
	
	private void setearPanelUtilidades(){
		tienda.setBounds(0,576,828,160);
		getContentPane().add(tienda);
		jugador.setBounds(828,576,300,160);
		getContentPane().add(jugador);
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
		float x = e.getX();
		float y = e.getY();
		grafico.setSize(grafico.getAncho(), grafico.getAlto());
		panelJuego.setComponentZOrder(grafico, 0);
	}

	public void eliminar(Elemento e) {
		panelJuego.remove(e.obtenerGrafico());
		panelJuego.repaint();
		repaint();
	}
	
	public Tienda getTienda() {
		return tienda;
	}
}
//setbound
//setlocation