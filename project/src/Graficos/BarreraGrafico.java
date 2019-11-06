package Graficos;

import javax.swing.ImageIcon; 

public class BarreraGrafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public BarreraGrafico() {
			super();
			width  =103;
			height = 97;
			image = new ImageIcon(getClass().getResource("/Sprites/muro.gif"));
			this.setIcon(image);
		}
}
