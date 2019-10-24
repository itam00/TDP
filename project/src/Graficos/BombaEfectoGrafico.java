package Graficos;

import javax.swing.ImageIcon;

public class BombaEfectoGrafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2211322728921357375L;

	public BombaEfectoGrafico() {
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/bombaPowerUp.gif"));
		this.setIcon(image);
	}
}
