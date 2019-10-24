package Graficos;

import javax.swing.ImageIcon;

public class Torre3Grafica extends ElementoGrafico{

	public Torre3Grafica() {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre3.gif"));
		this.setIcon(image);
	}

}
