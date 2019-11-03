package Graficos;

import javax.swing.ImageIcon;

public class Torre4Grafica extends ElementoGrafico{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Torre4Grafica() {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre4.gif"));
		this.setIcon(image);
	}

}
