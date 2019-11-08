package GUI;
import Juego.Controlador;

public class ContadorTiempo extends Thread {

	private Controlador elJuego;
	private boolean pausa;

	public ContadorTiempo(Controlador elJuego) {
		this.elJuego = elJuego;
	}

	public void run() {
		while(!pausa){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.actualizar();
		}
	}
}