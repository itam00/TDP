package Graficos;

import javax.swing.ImageIcon;

public class CongeladorEfectoGrafico extends ElementoGrafico{
	public CongeladorEfectoGrafico() {
		super();
		width  =97;
		height = 191;
		frecActualizacion=60;
		porDefecto = "congelacionEfecto.gif";
		setDefaultGif();
	}
	
}
