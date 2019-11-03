package Graficos;

import javax.swing.ImageIcon; 

public class FuegoGrafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public FuegoGrafico() {
			super();
			width  =103;
			height = 97;
			image = new ImageIcon(getClass().getResource("/Sprites/fuego.gif"));
			this.setIcon(image);
		}
}
