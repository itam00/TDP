package Graficos;

import javax.swing.ImageIcon;

public class Enemigo2Grafico extends ElementoGrafico{
	public Enemigo2Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo2.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}
}
