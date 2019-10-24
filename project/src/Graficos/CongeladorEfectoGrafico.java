package Graficos;

import javax.swing.ImageIcon;

public class CongeladorEfectoGrafico extends ElementoGrafico{
	public CongeladorEfectoGrafico() {
		super();
		width  =97;
		height = 191;

		image = new ImageIcon(getClass().getResource("/Sprites/congelacionPowerUp.gif"));
		this.setIcon(image);
	}
	
}
