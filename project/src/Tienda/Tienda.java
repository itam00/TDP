package Tienda;

import java.awt.Dimension; 
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import Juego.Jugador;
import Juego.Mapa;
import Personajes.Torre;
import PowerUps.PowerUp;
import Recolectable.*;

public class Tienda extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Torre comprado;
	protected PowerUp usado;
	protected Jugador jugador;
	ManejadorPowerUp manejadorCongelacion;
	ManejadorPowerUp manejadorBomba;
	ManejadorPowerUp manejadorEscudo;
	ManejadorPowerUp manejadorPortal;
	ManejadorPowerUp manejadorFuego;
	ManejadorPowerUp manejadorBarrera;
	ManejadorPowerUp manejadorTrampa;
	ManejadorPowerUp manejadorEscudoInvencible;
	
	public Tienda(Jugador j) {
		this.setPreferredSize(new Dimension(824, 170));
		this.setLayout(null);
		jugador = j;
		manejadorCongelacion = new ManejadorCongelacion(this);
		manejadorBomba= new ManejadorBomba(this);
		manejadorEscudo= new ManejadorEscudo(this);
		manejadorPortal = new ManejadorPortal(this);
		manejadorFuego = new ManejadorFuego(this);
		manejadorBarrera= new ManejadorBarrera(this);
		manejadorTrampa= new ManejadorTrampa(this);
		manejadorEscudoInvencible= new ManejadorEscudoInvencible(this);
		
		
		agregarBotones();
	}
	public void comprar(Torre t) {
		if(jugador.getOro()>=t.getPrecio()) {
			comprado = t;
			jugador.quitarOro(t.getPrecio());
		}
	}
	
	public void comprar(PowerUp p,ManejadorPowerUp m) {
		if(jugador.getOro()>=p.getPrecio()) {
			jugador.quitarOro(p.getPrecio());
			m.agregarPowerUp();
		}
	}
	
	public void devolver(Torre t) {
		jugador.agregarOro(t.getPrecio());
	}
	
	public void setPowerUpUsado(PowerUp p) {
		usado = p;
	}
	
	public Torre getComprado() {
		Torre aux = comprado;
		//arreglar botones
		comprado = null;
		return aux;
	}
	
	public PowerUp getPowerUpUsado() {
		PowerUp aux = usado;
		usado = null;
		return aux;
	}
	public boolean hayComprado() {
		return comprado != null;
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
		manejadorCongelacion.colocarEnTienda(600,10);
		manejadorBomba.colocarEnTienda(600,45);
		manejadorEscudo.colocarEnTienda(600,80);
		manejadorPortal.colocarEnTienda(600,115);
		manejadorFuego.colocarEnTienda(670, 10);
		manejadorBarrera.colocarEnTienda(670, 45);
		manejadorTrampa.colocarEnTienda(670, 80);
		manejadorEscudoInvencible.colocarEnTienda(670,115);
	}

	public void paint(Graphics g) {
		Image imagen = new ImageIcon(getClass().getResource("/Sprites/fondoTienda.png")).getImage();
        g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }

	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		int numeroRandom = (int)(Math.random()*5+1);
		int probabilidad = (int)(Math.random()*100+1);
		Recolectable aux=null;
		switch(numeroRandom) {
			case 1:
				if(probabilidad<50)
					aux = manejadorCongelacion.getPowerUp(x,y,m);
				break;
			case 2:
				if(probabilidad<50)
					aux = manejadorPortal.getPowerUp(x, y, m);
				break;
			case 3:
				if(probabilidad<50)
					aux = manejadorEscudo.getPowerUp(x, y, m);
				break;
			case 4:
				if(probabilidad<50)
					aux = manejadorCongelacion.getPowerUp(x, y, m);
				break;
			case 5:
				if(probabilidad<50)
					aux = manejadorBomba.getPowerUp(x, y, m);
				break;
		}
		return aux;
	}
	
	public void actualizar() {
		manejadorCongelacion.actualizar();
		manejadorBomba.actualizar();
		manejadorEscudo.actualizar();
		manejadorPortal.actualizar();
		manejadorFuego.actualizar();
		manejadorBarrera.actualizar();
		manejadorTrampa.actualizar();
		manejadorEscudoInvencible.actualizar();
	}
}
