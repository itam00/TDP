package EntidadGrafica;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class ElementoGrafico extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int width, height;
	protected ImageIcon image;
	protected boolean muerto;
	
	public ElementoGrafico() {
		muerto=false;
		this.setOpaque(false);
	}
	
	public void setMuerto(boolean b) {
		muerto=b;
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
	public void actualizar(int x,int y) {
		this.setLocation(x, y);
	}

}
