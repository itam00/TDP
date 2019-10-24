package Graficos;

import java.awt.Image;

import javax.swing.ImageIcon;

import Personajes.Enemigo;

public class DisparoGrafico2 extends ElementoGrafico {


	public DisparoGrafico2(int x, int y) {
		super();
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/proyectilTorre2.gif"));
		this.setIcon(image);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}

}