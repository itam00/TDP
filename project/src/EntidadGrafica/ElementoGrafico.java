package EntidadGrafica;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class ElementoGrafico extends JLabel{
	protected int x,y;
	protected int width, height;
	protected ImageIcon image;
	
	

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

	
	public abstract void actualizar();
	

	public abstract int obtenerFila();


}
