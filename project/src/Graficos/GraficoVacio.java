package Graficos;

import javax.swing.ImageIcon; 

public class GraficoVacio extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public GraficoVacio() {
			super();
			width  =103;
			height = 97;
			image = new ImageIcon(getClass().getResource("/Sprites/agregarIcono.gif"));
			this.setIcon(image);
		}
}
