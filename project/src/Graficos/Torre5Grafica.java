package Graficos;

import javax.swing.ImageIcon;

public class Torre5Grafica extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Torre5Grafica() {
		super();
		width  =103;
		height = 180;
		image = new ImageIcon(getClass().getResource("/Sprites/torre5.gif"));
		this.setIcon(image);
	}
}
