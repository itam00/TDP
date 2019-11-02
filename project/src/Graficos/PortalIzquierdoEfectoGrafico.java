package Graficos;

import javax.swing.ImageIcon;

public class PortalIzquierdoEfectoGrafico extends ElementoGrafico{
	public PortalIzquierdoEfectoGrafico() {
		super();
		width = 100;
		height = 100;

		image = new ImageIcon(getClass().getResource("/Sprites/portalIzquierdo.gif"));
		this.setIcon(image);
	}
	
}
