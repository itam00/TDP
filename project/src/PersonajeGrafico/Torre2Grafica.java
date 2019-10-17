package PersonajeGrafico;

import javax.swing.ImageIcon;

import EntidadGrafica.ElementoGrafico;

public class Torre2Grafica extends ElementoGrafico{

	public Torre2Grafica() {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre2.gif"));
		this.setIcon(image);
	}

}
