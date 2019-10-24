package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorEscudo;

public class EscudoGrafico extends PowerUpGrafico{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EscudoGrafico(ManejadorEscudo m) {
		super(m);
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("bombaPowerUp.gif"));
		this.setIcon(image);
	}
}
