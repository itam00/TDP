package Recolectable;

import Juego.Mapa;
import Personajes.Personaje;
import State.Congelado;

public class Congelador extends PowerUp{

	public Congelador(int x, int y, Mapa m) {
		super(x, y, m);
	}

	@Override
	public void afectar(Personaje p) {
		p.setState(new Congelado(p));
	}
}
