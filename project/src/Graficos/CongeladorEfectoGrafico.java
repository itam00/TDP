package Graficos;

import javax.swing.ImageIcon;

public class CongeladorEfectoGrafico extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CongeladorEfectoGrafico() {
		super();
		width  =97;
		height = 191;

		image = new ImageIcon(getClass().getResource("/Sprites/congelacionEfecto.gif"));
		image.getImage().flush();
		this.setIcon(image);
	}
	
}
