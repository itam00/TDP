package PersonajeGrafico;

import java.awt.Image;

import javax.swing.ImageIcon;

import EntidadGrafica.ElementoGrafico;
import Personajes.Enemigo;

public class DisparoGrafico extends ElementoGrafico {

	private static final long serialVersionUID = 1L;


	public DisparoGrafico(int x, int y) {
		super(x,y);
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/proyectil.png"));
		this.setIcon(image);
		this.setOpaque(false);
		System.out.println(this.x+"--"+this.y);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);

	}

	public void actualizar() {
		this.setLocation(x+=2, y);
		if (x>560)
			cambiar();
		if (x>600) {
			muerto=true;
		}
	}

	@Override
	public int obtenerFila() {
		// TODO Auto-generated method stub
		return 0;
	}



}