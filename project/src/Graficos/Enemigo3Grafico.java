package Graficos;

import javax.swing.ImageIcon;

public class Enemigo3Grafico extends ElementoGrafico{
	public Enemigo3Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo3.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}
