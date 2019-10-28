package Graficos;

import javax.swing.ImageIcon;

public class DisparoGraficoEnemigo5 extends ElementoGrafico{
	public DisparoGraficoEnemigo5(int x, int y) {
		super();
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo5Proyectil.gif"));
		this.setIcon(image);
	}
}
