package Graficos;

import java.awt.Image;

import javax.swing.ImageIcon;

import Personajes.Enemigo;

public class DisparoGrafico2 extends DisparoGrafico {


	public DisparoGrafico2(int x, int y) {
		super();

		image = new ImageIcon(getClass().getResource("/Sprites/proyectilTorre2.gif"));
		this.setIcon(image);
	}

	public void cambiar() {
		image.getImage().flush();
		image= new ImageIcon(getClass().getResource("/Sprites/proyectilImpacto.gif"));
		this.setIcon(image);
	}

}