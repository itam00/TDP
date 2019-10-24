package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorCongelacion;

public class CongeladorGrafico extends PowerUpGrafico{
	public CongeladorGrafico(ManejadorCongelacion m) {
		super(m);
		width  =103;
		height = 97;
		porDefecto = "congelacionPowerUp.gif";
		setDefaultGif();
	}
	
}
