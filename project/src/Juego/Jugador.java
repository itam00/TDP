package Juego;

import java.util.ArrayList;
import Recolectable.PowerUp;

public class Jugador {
	protected int oro;
	protected int puntaje;
	protected List<PowerUp> powerUps;
	
	public Jugador() {
		powerUps = new ArrayList<PowerUps>();
		oro = 0;
		puntaje = 0;
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
}
