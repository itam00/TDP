package PersonajeGrafico;

import java.awt.Image;

import javax.swing.ImageIcon;

import EntidadGrafica.ElementoGrafico;
import Personajes.Enemigo;

public class DisparoGrafico2 extends ElementoGrafico {


	public DisparoGrafico2(int x, int y) {
		super(x,y);
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/proyectilTorre2.gif"));
		this.setIcon(image);
		this.setOpaque(false);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}

	public void actualizar() {
		this.setLocation(x+=2, y);
		if (x>800) {
			muerto=true;
		}
	}
}