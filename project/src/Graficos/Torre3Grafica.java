package Graficos;

import javax.swing.ImageIcon;

public class Torre3Grafica extends ElementoGrafico{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Torre3Grafica() {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre3.gif"));
		this.setIcon(image);
	}

}
