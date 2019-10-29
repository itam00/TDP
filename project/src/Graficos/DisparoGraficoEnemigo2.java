package Graficos;

import javax.swing.ImageIcon;

public class DisparoGraficoEnemigo2 extends DisparoGrafico{
	public DisparoGraficoEnemigo2(int x, int y) {
		super();

		image = new ImageIcon(getClass().getResource("/Sprites/enemigo2Proyectil.gif"));
		this.setIcon(image);
	}
}
