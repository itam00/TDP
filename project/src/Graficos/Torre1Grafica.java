package Graficos;
import javax.swing.ImageIcon;

public class Torre1Grafica extends ElementoGrafico{

	private static final long serialVersionUID = 1L;

	public Torre1Grafica(int x,int y) {
		super();
		width  =103;
		height = 97;
		image = new ImageIcon(getClass().getResource("/Sprites/isaac.gif"));
		this.setIcon(image);
	}
	
}
