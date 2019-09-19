package PersonajeGrafico;
import javax.swing.ImageIcon;

import EntidadGrafica.*;
public class IsaacGrafico extends ElementoGrafico{

	public IsaacGrafico(int x,int y) {
		this.y= (int)y*96;
		this.x = (int)(x*102.4);
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/isaac.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}
	
	
}
