package Tienda;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Juego.Jugador;
import Personajes.Torre;
import Recolectable.PowerUp;

public class Tienda extends JPanel{
	protected Torre comprado;
	protected PowerUp usado;
	protected Jugador jugador;
	
	public Tienda(Jugador j) {
		this.setPreferredSize(new Dimension(724, 170));
		this.setLayout(new FlowLayout());
		jugador = j;
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
	
	public Torre getComprado() {
		Torre aux = comprado;
		//arreglar botones
		comprado = null;
		return aux;
	}
	
	public PowerUp getPowerUpUsado() {
		return usado;
	}
	public boolean hayComprado() {
		return comprado != null;
	}
	public boolean hayPowerUpUsado() {
		return usado != null;
	}
	
	public void agregarBotones() {
		JButton torres[] = new JButton[4];
		ManejadorPowerUp manejador[] = new ManejadorPowerUp[1];
		
		manejador[0] = new ManejadorCongelacion(this);
		torres[0] = new BotonTorre1(this);
		torres[1] = new BotonTorre2(this);
		torres[2] = new BotonTorre3(this);
		torres[3] = new BotonTorre4(this);
		
		for(int i=0;i<torres.length;i++) {
			this.add(torres[i]);
		}
		for(int i=0;i<manejador.length;i++) {
			this.add(manejador[i].getBotonComprar());
			this.add(manejador[i].getBotonUsar());
		}
	}

	public void paint(Graphics g) {
		Image imagen = new ImageIcon(getClass().getResource("/Sprites/fondoTienda.png")).getImage();
        g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }
	
}
