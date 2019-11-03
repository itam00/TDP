package Graficos;

import javax.swing.ImageIcon;

public class DisparoGraficoEnemigo5 extends DisparoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DisparoGraficoEnemigo5(int x, int y) {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo5Proyectil.gif"));
		this.setIcon(image);
	}
}
