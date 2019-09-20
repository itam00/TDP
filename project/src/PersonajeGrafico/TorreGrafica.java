package PersonajeGrafico;

import EntidadGrafica.ElementoGrafico;

public abstract class TorreGrafica extends ElementoGrafico{
	public TorreGrafica(int x, int y) {
		x = (int)(x/102.4);//setea exactamente en la "posicion donde deberia ir
		this.x = (int)(x*102.4);
		
		y = (int)(y/96);
		this.y = (int)(y*96);
	}
}
