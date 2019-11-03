package Graficos;

import javax.swing.ImageIcon;

public class Enemigo3Grafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Enemigo3Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo3.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}
