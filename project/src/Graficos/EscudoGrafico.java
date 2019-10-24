package Graficos;

import Tienda.ManejadorEscudo;

public class EscudoGrafico extends PowerUpGrafico{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EscudoGrafico(ManejadorEscudo m) {
		super(m);
		width  =103;
		height = 97;
		porDefecto = "bombaPowerUp.gif";
		setDefaultGif();
	}
}
