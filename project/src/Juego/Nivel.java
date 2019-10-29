package Juego;

import java.util.LinkedList;
import java.util.List;

import Personajes.Enemigo;

public abstract class Nivel {
	protected int frecuencia;
	protected LinkedList<Enemigo> lista;
	protected Mapa mapa;
	protected int cantEnemigos;

	public abstract List<Enemigo> getOleada();

}
