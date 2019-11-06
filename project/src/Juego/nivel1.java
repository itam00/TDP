package Juego;

import java.io.FileInputStream; 
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import Personajes.Enemigo;
import Personajes.Enemigo1;
import Personajes.Enemigo2;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;

public class nivel1 extends Nivel{
	
	
	
	public nivel1(Mapa mapa) {
		 
			 frecuencia=500;
			 this.mapa = mapa;
			 enemigos = new LinkedList<List<Enemigo>>();
			 agregarEnemigosAListas("\\src\\Niveles\\nivel1.properties");

	}
	
	
	

}