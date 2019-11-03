package Graficos;

import javax.swing.ImageIcon;

public class PortalDerechoEfectoGrafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PortalDerechoEfectoGrafico() {
		super();
		width = 100;
		height = 100;

		image = new ImageIcon(getClass().getResource("/Sprites/portalDerecho.gif"));
		this.setIcon(image);
	}
	
}
