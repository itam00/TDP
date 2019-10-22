package Graficos;

import javax.swing.ImageIcon;

public class CongeladorGrafico extends ElementoGrafico{
	public CongeladorGrafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/congelacionPowerUp.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
	
}
