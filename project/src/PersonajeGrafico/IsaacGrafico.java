package PersonajeGrafico;
import javax.swing.ImageIcon;

import EntidadGrafica.*;
public class IsaacGrafico extends ElementoGrafico{

	public IsaacGrafico(int x,int y) {
		posY = y;
		posX = x;
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/isaac.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}
	
	
}
