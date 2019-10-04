package PersonajeGrafico;

import EntidadGrafica.ElementoGrafico;

public abstract class TorreGrafica extends ElementoGrafico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TorreGrafica(int x, int y) {
		super((int)(x/102)*102,y);
	}
}
