package Tienda;

import javax.swing.JButton;
import javax.swing.JPanel;

import Juego.Jugador;
import Personajes.Torre;

public class Tienda extends JPanel{
	protected int cantBotones = 5;
	protected JButton botones[];
	protected Torre comprado;
	protected Jugador jugador;
	
	public Tienda(Jugador j) {
		botones = new JButton[cantBotones];
		jugador = j;
		botones[0] = new BotonTorre1();
		this.setSize(1024, 192);
		this.add(botones[0]);
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
}
