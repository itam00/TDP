package PersonajeGrafico;

import javax.swing.ImageIcon;

public class Torre2Grafica extends TorreGrafica{

	public Torre2Grafica(int x,int y) {
		super(x,y);
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/torre2.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

}
