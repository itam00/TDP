import Juego.Controlador;

public class ContadorTiempo extends Thread {

	private Controlador elJuego;

	ContadorTiempo(Controlador elJuego) {
		this.elJuego = elJuego;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.actualizar();
			System.gc();
		}
	}
}