package Graficos;

import javax.swing.ImageIcon;

public class EscudoInvencibleGrafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public EscudoInvencibleGrafico() {
			super();
			width  =103;
			height = 97;
			image = new ImageIcon(getClass().getResource("/Sprites/veneno.gif"));
			this.setIcon(image);
		}
}
