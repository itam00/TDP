package Graficos;

import javax.swing.ImageIcon;

public class Torre2Grafica extends ElementoGrafico{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Torre2Grafica() {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre2.gif"));
		this.setIcon(image);
	}

}
