package Graficos;

import javax.swing.ImageIcon;

public class Torre4Grafica extends ElementoGrafico{

	public Torre4Grafica() {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre4.png"));
		this.setIcon(image);
	}

}
