package Juego;

import java.util.LinkedList;
import java.util.List;

import Personajes.Enemigo;

public class nivel1 extends Nivel{
	
	
	
	public nivel1(Mapa mapa) {
		 
			 frecuencia=500;
			 this.mapa = mapa;
			 enemigos = new LinkedList<List<Enemigo>>();
			 agregarEnemigosAListas("\\src\\Niveles\\nivel1.properties");

	}
	
	
	

}