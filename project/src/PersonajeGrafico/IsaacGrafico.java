package PersonajeGrafico;
import javax.swing.ImageIcon;

import EntidadGrafica.*;
public class IsaacGrafico extends ElementoGrafico{

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
	public int obtenerFila() {
		return (int)(y/96);
	}
	
	public void actualizar() {
		
	}
	
}
