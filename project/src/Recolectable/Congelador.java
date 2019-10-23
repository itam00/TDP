package Recolectable;

import Graficos.CongeladorEfectoGrafico;
import Graficos.CongeladorGrafico;

import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import State.CongeladoEnemigo;
import State.CongeladoTorre;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Congelador extends PowerUp{

	public Congelador(int x, int y, Mapa m) {
		super(x, y, m);
		grafico = new CongeladorGrafico();
		visitor = new VisitorVacio();
	}
	
	public Congelador() {
		precio=0;
		grafico = new CongeladorEfectoGrafico();
		visitor= new VisitorPowerUp(this);
	}

	public void afectar(Torre p) {
		p.setState(new CongeladoTorre(p));
	}
	
	public void afectar(Enemigo p) {
		p.setState(new CongeladoEnemigo(p));
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
		return x+20;
	}

}
