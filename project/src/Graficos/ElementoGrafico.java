package Graficos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ElementoGrafico extends JLabel{

	protected int width, height;
	protected ImageIcon image;
	protected boolean muerto;
	
	
	public ElementoGrafico(String dir) {
		muerto = false;
		this.setOpaque(false);
		image = new ImageIcon(getClass().getResource(dir));
		width  =image.getIconWidth();
		height = image.getIconHeight();
		this.setSize(width,height);
		this.setIcon(image);
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
