package Recolectable;

import Graficos.CongeladorGrafico;
import Juego.Mapa;
import Personajes.Personaje;
import State.Congelado;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;

public class Congelador extends PowerUp{

	public Congelador(int x, int y, Mapa m) {
		super(x, y, m);
		grafico = new CongeladorGrafico();
		visitor = new VisitorPowerUp(this);
	}
	public Congelador() {
		precio=0;
		grafico = new CongeladorGrafico();
	}

	@Override
	public void afectar(Personaje p) {
		p.setState(new Congelado(p));
	}
	@Override
	public void agregar(Tienda tienda) {
		tienda.agregar(this);
	}
	@Override
	public int getInicioRangoX() {
		return x-20;
	}
	@Override
	public int getFinRangoX() {
		return x-20;
	}
}
