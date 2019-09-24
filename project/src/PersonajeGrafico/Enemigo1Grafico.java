package PersonajeGrafico;

import javax.swing.ImageIcon;

public class Enemigo1Grafico extends EnemigoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Enemigo1Grafico(int x, int y) {
		super(x, y);
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo1.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}

}
