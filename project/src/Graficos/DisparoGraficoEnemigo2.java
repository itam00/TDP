package Graficos;

import javax.swing.ImageIcon;

public class DisparoGraficoEnemigo2 extends DisparoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DisparoGraficoEnemigo2(int x, int y) {
		super();

		image = new ImageIcon(getClass().getResource("/Sprites/enemigo2Proyectil.gif"));
		this.setIcon(image);
	}
}
