package Graficos;

import javax.swing.ImageIcon;

import Tienda.ManejadorEscudo;

public class EscudoEfectoGrafico extends ElementoGrafico{
	public EscudoEfectoGrafico() {
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/escudoPowerUp.gif"));
		this.setIcon(image);
	}
}
