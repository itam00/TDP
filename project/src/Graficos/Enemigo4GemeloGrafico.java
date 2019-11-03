package Graficos;

import javax.swing.ImageIcon;

public class Enemigo4GemeloGrafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Enemigo4GemeloGrafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo4Gemelo.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}
