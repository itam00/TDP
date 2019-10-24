package Graficos;

import javax.swing.ImageIcon;

public class DisparoGraficoEnemigo2 extends ElementoGrafico{
	public DisparoGraficoEnemigo2(int x, int y) {
		super();
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo2Proyectil.gif"));
		this.setIcon(image);
	}
}
