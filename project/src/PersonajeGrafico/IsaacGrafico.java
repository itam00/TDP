package PersonajeGrafico;
import javax.swing.ImageIcon;

import EntidadGrafica.*;
public class IsaacGrafico extends ElementoGrafico{

	private static final long serialVersionUID = 1L;

	public IsaacGrafico(int x,int y) {
		this.x = (int)(x*102.4);
		this.y = y*96;
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/isaac.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}
	
	public void actualizar() {
		
	}
	
}
