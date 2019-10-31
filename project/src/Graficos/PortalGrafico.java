package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorPowerUp;

public class PortalGrafico extends PowerUpGrafico{

	public PortalGrafico(ManejadorPowerUp m) {
		super(m);
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/portalPowerUp.gif"));
		this.setIcon(image);
	}

}
