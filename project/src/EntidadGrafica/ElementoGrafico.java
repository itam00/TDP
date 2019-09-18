package EntidadGrafica;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class ElementoGrafico extends JLabel{
	protected int posX,posY;
	protected int width, height;
	protected Icon image;
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	public int getAncho() {
		return width;
	}
	public int getAlto() {
		return height;
	}
}
