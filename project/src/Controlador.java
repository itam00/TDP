
public class Controlador {
	protected GUI gui;
	
	public Controlador(GUI g) {
		gui = g;
	}
	
	public void mover() {
		gui.avanzar();
	}
	
}
