package Graficos;

import javax.swing.ImageIcon;

public class Torre5Grafica extends ElementoGrafico{
	public Torre5Grafica() {
		super();
		width  =180;
		height = 103;
		image = new ImageIcon(getClass().getResource("/Sprites/torre5.gif"));
		this.setIcon(image);
	}
}
