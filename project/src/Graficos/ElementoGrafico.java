package Graficos;

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
	
	public ElementoGrafico(String dir) {
		image = new ImageIcon(getClass().getResource(dir));
		this.setIcon(image);
		width  =103;
		height = 97;
		setOpaque(false);
		muerto=false;
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
	
	public void actualizar(float x,float y) {
		this.setLocation((int)x, (int)y);
	}

}
