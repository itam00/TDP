package Graficos;


import javax.swing.ImageIcon;


public class DisparoGrafico4 extends ElementoGrafico {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DisparoGrafico4(int x, int y) {
		super();
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/proyectilTorre4.gif"));
		this.setIcon(image);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}

}