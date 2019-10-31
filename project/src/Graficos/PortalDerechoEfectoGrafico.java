package Graficos;

import javax.swing.ImageIcon;

public class PortalDerechoEfectoGrafico extends ElementoGrafico{
	public PortalDerechoEfectoGrafico() {
		super();
		width = 100;
		height = 100;

		image = new ImageIcon(getClass().getResource("/Sprites/portalDerecho.gif"));
		this.setIcon(image);
	}
	
}
