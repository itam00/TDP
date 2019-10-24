package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorCongelacion;

public class CongeladorGrafico extends PowerUpGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CongeladorGrafico(ManejadorCongelacion m) {
		super(m);
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/congelacionPowerUp.gif"));
		this.setIcon(image);
	}
	
}
