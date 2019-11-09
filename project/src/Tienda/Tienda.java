package Tienda;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidad.Comprable;
import Juego.Jugador;
import Juego.Mapa;
import Objetos.Obstaculo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Recolectable.*;

@SuppressWarnings("serial")
public class Tienda extends JPanel{

	protected Torre torreComprada;
	protected boolean seVendeTorre;
	protected Obstaculo obstaculoUsado;
	protected PowerUp usado;
	protected Jugador jugador;
	protected JLabel oro,puntos;
	List<ManejadorComprable> botones;

	
	public Tienda(Jugador j) {
		this.setPreferredSize(new Dimension(824, 170));
		this.setLayout(null);
		jugador = j;
		botones= new LinkedList<ManejadorComprable>();
		botones.add( new ManejadorCongelacion(this));
		botones.add(new ManejadorBomba(this));
		botones.add(new ManejadorEscudo(this));
		botones.add(new ManejadorPortal(this));
		botones.add(new ManejadorFuego(this));
		botones.add(new ManejadorBarrera(this));
		botones.add(new ManejadorTrampa(this));
		botones.add(new ManejadorEscudoInvencible(this));
		seVendeTorre=false;
		
		agregarBotones();
		agregarDatosJugador();
	}
	
	public void comprarTorre(Torre t) {
		if(jugador.getOro()>=t.getPrecio()) {
			torreComprada = t;
			jugador.quitarOro(t.getPrecio());
		}
	}
	
	public void comprar(Comprable p,ManejadorPowerUp m) {
		if(jugador.getOro()>=p.getPrecio()) {
			jugador.quitarOro(p.getPrecio());
			m.agregarPowerUp();
		}
	}

	
	public void devolver(int valor) {
		jugador.agregarOro(valor);
	}
	
	public void setPowerUpUsado(PowerUp p) {
		usado = p;
	}
	
	public void setObstaculoUsado(Obstaculo o) {
		obstaculoUsado = o;
	}
	
	public boolean hayTorreComprada() {
		return torreComprada!=null;
	}
	public boolean hayObstaculoUsado() {
		return obstaculoUsado!=null;
	}
	public Torre getTorreComprada() {
		Torre aux = torreComprada;
		torreComprada =null;
		return aux;
	}
	public Obstaculo getObstaculoComprado() {
		Obstaculo aux = obstaculoUsado;
		obstaculoUsado = null;
		return aux;
	}
	
	public PowerUp getPowerUpUsado() {
		PowerUp aux = usado;
		usado = null;
		return aux;
	}

	public boolean hayPowerUpUsado() {
		return usado != null;
	}
	
	protected void agregarBotones() {
		JButton torres[] = new JButton[5];
		
		torres[0] = new BotonTorre1(this);
		torres[1] = new BotonTorre2(this);
		torres[2] = new BotonTorre3(this);
		torres[3] = new BotonTorre4(this);
		torres[4] = new BotonTorre5(this);
		
		for(int i=0;i<torres.length;i++) {
			this.add(torres[i]);
			torres[i].setBounds(i*100+20, 20,100,100);
		}
		for (int i=0; i<4;i++) {
			botones.get(i).colocarEnTienda(600,i*35+10);
		}
		for (int i=0; i<4;i++) {
			botones.get(i+4).colocarEnTienda(700,i*35+10);
		}
		
		BotonVenta venta= new BotonVenta(this);
		venta.setBounds(520, 20, 80, 40);
		add(venta);
	}
	
	protected void agregarDatosJugador() {
		oro = new JLabel(jugador.getOro()+"");
		JLabel oroIcono = new JLabel();
		puntos = new JLabel("Puntos: "+jugador.getPuntaje());
		oro.setFont(new Font("Arial",3,32));
		puntos.setFont(new Font("Arial",3,32));
		
		oroIcono.setIcon(new ImageIcon(getClass().getResource("/Sprites/oro.gif")));
		this.add(oroIcono);
		this.add(oro);
		this.add(puntos);
		oro.setBounds(850, 50, 50, 50);
		oroIcono.setBounds(900, 50, 50,50);
		puntos.setBounds(850,90,150,50);
		
		
	}

	public void paint(Graphics g) {
		Image imagen = new ImageIcon(getClass().getResource("/Sprites/fondoTienda.png")).getImage();
        g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }

	/**
	 * retorna o no un recolectable al al azar y lo inicializa con los atributos del mapa, x e y
	 * @param x lugar en x donde se inicializara el recolectable
	 * @param y lugar en y donde se inicializara el recolectable
	 * @param m mapa con el que se inicializara el recolecatable
	 * @return recolectable o nulo
	 */
	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		int numeroRandom = (int)(Math.random()*botones.size());
		return botones.get(numeroRandom).getRecolectable(x, y, m);
	}
	
	public void actualizar() {
		for (ManejadorComprable m:botones) {
			m.actualizar();
		}
		oro.setText(""+ jugador.getOro());
		puntos.setText("Puntos: "+ jugador.getPuntaje());
	}
	
	public boolean hayVenta() {
		return seVendeTorre;
	}
	
	public void vendio() {
		seVendeTorre=false;
	}
	
	public void quiereVender() {
		seVendeTorre=true;
	}
	public void agregarRecompensa(int oro, int puntos) {
		jugador.agregarOro(oro);
		jugador.agregarPuntos(puntos);
	}
}
