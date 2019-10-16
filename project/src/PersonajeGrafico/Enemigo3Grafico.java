package PersonajeGrafico;

import javax.swing.ImageIcon;

public class Enemigo3Grafico extends EnemigoGrafico{
	public Enemigo3Grafico(int x, int y) {
		super(x, y);
		image = new ImageIcon(getClass().getResource("/Sprites/enemigo3.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}
}
