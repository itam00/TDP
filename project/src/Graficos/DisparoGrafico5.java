package Graficos;

import javax.swing.ImageIcon;

public class DisparoGrafico5 extends ElementoGrafico{
	public DisparoGrafico5(int x, int y) {
		super();

		image = new ImageIcon(getClass().getResource("/Sprites/proyectilTorre5.gif"));
		this.setIcon(image);
	}

}
