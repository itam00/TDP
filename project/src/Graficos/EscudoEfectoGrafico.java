package Graficos;

import javax.swing.ImageIcon; 

public class EscudoEfectoGrafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EscudoEfectoGrafico() {
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/escudoPowerUp.gif"));
		this.setIcon(image);
	}
}
