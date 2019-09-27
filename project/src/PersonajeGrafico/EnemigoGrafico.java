package PersonajeGrafico;

import javax.swing.ImageIcon;

import EntidadGrafica.ElementoGrafico;

public class EnemigoGrafico extends ElementoGrafico{

	public EnemigoGrafico(int x, int y) {
		super(x, y);
		width  =103;
		height = 97;
	}
	
	public int obtenerFila() {
		return (int)(y/96);
	}
	
	
	@Override
	public void actualizar() {
		this.setLocation(x-=2, y);
		if (x<=10)
			muerto=true;
		
	}

}
