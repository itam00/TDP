package Graficos;

import javax.swing.ImageIcon;

public class BombaGrafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public BombaGrafico() {
			super();
			image = new ImageIcon(getClass().getResource("/Sprites/bombaPowerUp.gif"));
			this.setIcon(image);
			width  =103;
			height = 97;
		}
}
