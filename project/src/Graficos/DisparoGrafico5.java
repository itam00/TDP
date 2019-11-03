package Graficos;

import javax.swing.ImageIcon;

public class DisparoGrafico5 extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DisparoGrafico5(int x, int y) {
		super();

		image = new ImageIcon(getClass().getResource("/Sprites/proyectilTorre5.gif"));
		this.setIcon(image);
	}

}
