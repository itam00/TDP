package PersonajeGrafico;
import javax.swing.ImageIcon;

import EntidadGrafica.*;
public class IsaacGrafico extends TorreGrafica{

	private static final long serialVersionUID = 1L;

	public IsaacGrafico(int x,int y) {
		super(x,y);
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/isaac.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}

	@Override
	
	
	public void actualizar() {
		
	}
	
}
