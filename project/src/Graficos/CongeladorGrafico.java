package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorCongelacion;

public class CongeladorGrafico extends PowerUpGrafico{
	public CongeladorGrafico(ManejadorCongelacion m) {
		super(m);
		image = new ImageIcon(getClass().getResource("/Sprites/congelacionPowerUp.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
	
}
