package Graficos;

import javax.swing.ImageIcon;

public class Torre5Grafica extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Torre5Grafica() {
		super();
		width  =180;
		height = 103;
		image = new ImageIcon(getClass().getResource("/Sprites/torre5.gif"));
		this.setIcon(image);
	}
}
