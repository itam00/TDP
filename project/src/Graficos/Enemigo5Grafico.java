package Graficos;

import javax.swing.ImageIcon;

public class Enemigo5Grafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Enemigo5Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo5.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}
