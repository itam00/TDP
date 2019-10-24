package Graficos;

import javax.swing.ImageIcon;

public class PiedraGrafica extends ElementoGrafico {

	private static final long serialVersionUID = 1L;

	public PiedraGrafica(int x, int y) {
		super();
		width  =100;
		height = 100;
		porDefecto = "piedra.gif";
		setDefaultGif();
	}

}
