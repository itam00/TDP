package Graficos;

import java.awt.Image;

import javax.swing.ImageIcon;

import Personajes.Enemigo;

public class DisparoGrafico extends ElementoGrafico {


	public DisparoGrafico(int x, int y) {
		super();
		width  =100;
		height = 100;
		porDefecto = "proyectil.gif";
		setDefaultGif();
	}


}