package Graficos;

import javax.swing.ImageIcon;

public class Enemigo5Grafico extends ElementoGrafico{
	public Enemigo5Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo5.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}