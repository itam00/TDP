package PersonajeGrafico;

import javax.swing.ImageIcon;

import EntidadGrafica.ElementoGrafico;

public class PiedraGrafica extends ElementoGrafico {

	private static final long serialVersionUID = 1L;

	public PiedraGrafica(int x, int y) {
		super(x, y);
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/piedra.png"));
		this.setIcon(image);
		this.setOpaque(false);
	}

	@Override
	public void actualizar() {
	}

}
