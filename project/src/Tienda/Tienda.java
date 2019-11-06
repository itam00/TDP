package Tienda;

import java.awt.Dimension; 


import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	protected Obstaculo obstaculoUsado;
	protected PowerUp usado;
	protected Jugador jugador;
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
		
		
		agregarBotones();
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
	
	public void devolver(Comprable t) {
		jugador.agregarOro(t.getPrecio());
	}
	
	public void setPowerUpUsado(PowerUp p) {
		usado = p;
	}
	
	public void setObstaculoUsado(Obstaculo o) {
		
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
	
	public void agregarBotones() {
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
	}

	public void paint(Graphics g) {
		Image imagen = new ImageIcon(getClass().getResource("/Sprites/fondoTienda.png")).getImage();
        g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }

	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		int numeroRandom = (int)(Math.random()*botones.size());
		return botones.get(numeroRandom).getRecolectable(x, y, m);
	}
	
	public void actualizar() {
		for (ManejadorComprable m:botones)
			m.actualizar();
	}
}
