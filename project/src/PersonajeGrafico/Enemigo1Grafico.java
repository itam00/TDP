package PersonajeGrafico;

import javax.swing.ImageIcon;

import EntidadGrafica.ElementoGrafico;

public class Enemigo1Grafico extends ElementoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Enemigo1Grafico() {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo1.gif"));
		this.setIcon(image);
		width  =103;
		height = 97;
	}

}
