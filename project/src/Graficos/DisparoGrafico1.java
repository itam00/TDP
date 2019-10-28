package Graficos;

import java.awt.Image;

import javax.swing.ImageIcon;

import Personajes.Enemigo;

public class DisparoGrafico1 extends DisparoGrafico {


	public DisparoGrafico1(int x, int y) {
		super();
		width  =100;
		height = 100;
		image = new ImageIcon(getClass().getResource("/Sprites/proyectil.gif"));
		this.setIcon(image);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}


}