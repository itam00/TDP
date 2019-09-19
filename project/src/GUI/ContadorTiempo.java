package GUI;
import Juego.Controlador;

public class ContadorTiempo extends Thread {

	private Controlador elJuego;
	private GUI g;

	public ContadorTiempo(Controlador elJuego, GUI g) {
		this.elJuego = elJuego;
		this.g=g;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.actualizar();
		}
	}
}