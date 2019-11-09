package Juego;

public class Jugador{
	protected int oro;
	protected int puntaje;
	
	public Jugador() {
		oro = 600;
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
	public void agregarPuntos(int p) {
		puntaje+=p;
	}
	public void reiniciar() {
		puntaje=0;
		oro=1000;
	}

}
