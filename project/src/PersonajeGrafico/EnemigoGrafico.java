package PersonajeGrafico;

import javax.swing.ImageIcon;

public class EnemigoGrafico extends TorreGrafica{

	public EnemigoGrafico(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo1.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}
	public int obtenerFila() {
		return (int)(y/96);
	}

}
