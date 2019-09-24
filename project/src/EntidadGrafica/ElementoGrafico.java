package EntidadGrafica;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class ElementoGrafico extends JLabel{
	protected int x,y;
	protected int width, height;
	protected ImageIcon image;
	protected boolean muerto;
	
	public ElementoGrafico(int x, int y) {
		this.x=x*102;
		this.y=y*96;
		muerto=false;
	}
	

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
	
	public boolean estaMuerto() {
		return muerto;
	}

	
	public abstract void actualizar();
	

	public abstract int obtenerFila();


}
