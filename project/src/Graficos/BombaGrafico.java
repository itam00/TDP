package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorBomba;

public class BombaGrafico extends PowerUpGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public BombaGrafico(ManejadorBomba m) {
			super(m);
			width  =103;
			height = 97;
			image = new ImageIcon(getClass().getResource("bombaPowerUp.gif"));
			this.setIcon(image);
		}
}
