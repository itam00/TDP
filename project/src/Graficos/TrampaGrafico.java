package Graficos;

import javax.swing.ImageIcon;


public class TrampaGrafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public TrampaGrafico() {
			super();
			width  =103;
			height = 97;
			image = new ImageIcon(getClass().getResource("/Sprites/moneda.gif"));
			this.setIcon(image);
		}
}
