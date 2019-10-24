package Graficos;

import javax.swing.ImageIcon;

public class Enemigo4Grafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Enemigo4Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo4.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}
