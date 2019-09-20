package EntidadGrafica;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class ElementoGrafico extends JLabel{
	protected int x,y;
	protected int width, height;
	protected Icon image;
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public int getAncho() {
		return width;
	}
	public int getAlto() {
		return height;
	}
	public abstract int obtenerFila();

}
