package Graficos;

import javax.swing.ImageIcon;

public class CongeladorEfectoGrafico extends ElementoGrafico{
	public CongeladorEfectoGrafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/congelacionEfecto.gif"));
		this.setIcon(image);
		width  =97;
		height = 191;
	}
	
}
