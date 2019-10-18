package Juego;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Recolectable.PowerUp;

public class Jugador extends JPanel{
	protected int oro;
	protected int puntaje;
	protected List<PowerUp> powerUps;
	
	public Jugador() {
		powerUps = new ArrayList<PowerUp>();
		oro = 0;
		puntaje = 0;
		configurarPanel();
	}
	
	public int getOro() {
		return oro;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void agregarOro(int o) {
		oro+=o;
	}
	public void quitarOro(int o) {
		oro-=o;
	}
	public void sumarPuntaje(int p) {
		puntaje+=p;
	}
	public void reiniciarPuntaje() {
		puntaje=0;
	}
	
	public void configurarPanel(){
		JLabel lPuntos = new JLabel("Puntos: ");
		JLabel lOro = new JLabel("Oro: ");
		
		//setPreferredSize(new Dimension(300, 170));
		setLayout(null);
		
		this.add(lPuntos);
		lPuntos.setBounds(0,0,80,50);
		this.add(lOro);
	
	}
	public void paint(Graphics g) {
		Image imagen = new ImageIcon(getClass().getResource("/Sprites/fondoTienda.png")).getImage();
        g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }
}
