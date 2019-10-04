package Tienda;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Juego.Jugador;
import Personajes.Torre;

public class Tienda extends JPanel{
	protected int cantBotones = 5;
	protected JButton botones[];
	protected Torre comprado;
	protected Jugador jugador;
	
	public Tienda(Jugador j) {
		this.setPreferredSize(new Dimension(1024, 170));
		this.setLayout(new FlowLayout());
		botones = new JButton[cantBotones];
		jugador = j;
		agregarBotones();
	}
	public void comprar(Torre t) {
		if(jugador.getOro()>=t.getPrecio()) {
			comprado = t;
			jugador.quitarOro(t.getPrecio());
		}
	}
	
	public Torre getComprado() {
		Torre aux = comprado;
		//arreglar botones
		comprado = null;
		return aux;
	}
	public boolean hayComprado() {
		return comprado != null;
	}
	
	public void agregarBotones() {
		botones[0] = new BotonTorre1(this);
		botones[1] = new BotonTorre1(this);
		this.add(botones[1]);
		this.add(botones[0]);
	}

	public void paint(Graphics g) {
		Image imagen = new ImageIcon(getClass().getResource("/Sprites/fondoTienda.png")).getImage();
        g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }
}
