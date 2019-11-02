package Graficos;

import javax.swing.ImageIcon;

public class Torre5Grafica extends ElementoGrafico{
	public Torre5Grafica() {
		super();
		width  =103;
		height = 180;
		image = new ImageIcon(getClass().getResource("/Sprites/torre5.gif"));
		this.setIcon(image);
	}
}
