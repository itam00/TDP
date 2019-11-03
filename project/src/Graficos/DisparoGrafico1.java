package Graficos;


import javax.swing.ImageIcon;


public class DisparoGrafico1 extends DisparoGrafico {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DisparoGrafico1(int x, int y) {
		super();
		image = new ImageIcon(getClass().getResource("/Sprites/proyectil.gif"));
		this.setIcon(image);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}


}