package GUI;

import java.awt.Color; 
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Entidad.Elemento;
import Graficos.ElementoGrafico;
import Juego.Controlador;
import Juego.Jugador;
import Juego.Mapa;
import Tienda.Tienda;

@SuppressWarnings("serial")
public class GUI extends JFrame implements MouseListener{

	protected Controlador controlador;
	protected ImageIcon fondo;
	protected JPanel panelJuego,panelTienda,panelFinal;
	protected Tienda tienda;
	protected Jugador jugador;
	protected JLabel labelFinalJuego,labelNivel;

	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);
	}

	public GUI() {
		
		setearVentana();
		setearPanelJuego();
		
		jugador = new Jugador();
		tienda = new Tienda(jugador);
		addMouseListener(this);
		
		setearPanelTienda();
		setearPanelPerder();

		Mapa mapa= new Mapa(this,tienda);
		controlador = new Controlador(this,mapa, jugador,tienda);
		ContadorTiempo tiempo = new ContadorTiempo(controlador);
		tiempo.start();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
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
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1028, 768);// esto quedo asi porque con 1024 no se ve el borde
	}
	

	/**
	 * configura el panel principal
	 */
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
	
	/**
	 * configura y agraga la tienda al panel principal
	 */
	
	private void setearPanelTienda(){
		tienda.setBounds(0,576,1028,160);
		getContentPane().add(tienda);
		this.repaint();
	}
	
	/**
	 * agrega un label con la imagen del mapa de fondo
	 */

	private void agregarFondo() {
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Sprites/sueloMapa.png"));
		JLabel dibujo = new JLabel(imagen);
		dibujo.setOpaque(false);
		add(dibujo);
		dibujo.setSize( 1024, 576);
		
		panelJuego.add(dibujo);
	}
	
	/**
	 * a�ade el elemento grafico de un elemento e al panel principal
	 * @param e elemento al que se le solicita su grafico para ser a�adido
	 */

	public synchronized void a�adirElemento(Elemento e) {
		ElementoGrafico grafico = e.getGrafico();
		panelJuego.add(grafico);
		
		panelJuego.setComponentZOrder(grafico, 0);
	}
	/**
	 * Elimina el elemento grafico de un elemento e del panel principial
	 * @param e elemento al que se le solicita su grafico para ser eliminado
	 */

	public void eliminar(Elemento e) {
		panelJuego.remove(e.getGrafico());
		panelJuego.repaint();
		repaint();
	}
	
	public void setearPanelPerder() {
		panelFinal= new JPanel();
		panelFinal.setLayout(new GridLayout());
		JButton volverAJugar= (new JButton("volver a jugar"));
		JButton salir= new JButton("salir");
		volverAJugar.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				reiniciar();
			}
	
			@Override
			public void mouseEntered(MouseEvent e) {	}
	
			@Override
			public void mouseExited(MouseEvent e) {}
	
			@Override
			public void mousePressed(MouseEvent e) {
				controlador.reiniciar();	
			}
			@Override
			public void mouseReleased(MouseEvent e) {}
		});
		
		salir.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);	
			}
		});
		volverAJugar.setBounds(100,50,100, 50);
		salir.setBounds(100, 100, 100, 50);
		labelFinalJuego= new JLabel ();
		labelFinalJuego.setForeground(new Color(0,0,0));
		labelFinalJuego.setFont(new Font("Arial",8,30));
		labelFinalJuego.setBounds(100,0,350,50);
		panelFinal.setBounds(400,200,300, 300);
		panelFinal.setBackground(new Color(100,255,100));
		panelFinal.add(labelFinalJuego);
		panelFinal.add(volverAJugar);
		panelFinal.add(salir);
		
		setearLabelNivel();
			
	}
	
	public void enemigoGana() {
		labelFinalJuego.setText("Perdiste");
		mostrarPanelFinal();
	}
	
	public void jugadorGana() {
		labelFinalJuego.setText("Ganaste");
		mostrarPanelFinal();
	}
	protected void mostrarPanelFinal() {
		panelFinal.setEnabled(true);
		panelFinal.setVisible(true);
		panelJuego.add(panelFinal);
		panelJuego.setComponentZOrder(panelFinal, 0);
		panelJuego.repaint();
		repaint();
	}
	
	public void mostrarLabelNivel(int nivel, int oleada) {
		labelNivel.setText("Nivel :"+nivel+" Oleada: "+oleada);
	}
	
	protected void setearLabelNivel() {
		labelNivel = new JLabel();
		labelNivel.setFont(new Font("Arial",3,32));
		labelNivel.setForeground(Color.black);
		panelJuego.add(labelNivel);
		labelNivel.setBounds(740, 0, 500, 40);
		panelJuego.setComponentZOrder(labelNivel, 0);
	}
	
	public void reiniciar() {
		panelFinal.setEnabled(false);
		panelFinal.setVisible(false);
		panelJuego.remove(panelFinal);
		panelJuego.repaint();
		repaint();
		controlador.reiniciar();
	}
	
}

