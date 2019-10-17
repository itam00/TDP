package Graficos;

import java.awt.Image;

import javax.swing.ImageIcon;

import Personajes.Enemigo;

public class DisparoGrafico extends ElementoGrafico {


	public DisparoGrafico(int x, int y) {
		super();
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/proyectil.png"));
		this.setIcon(image);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}


}