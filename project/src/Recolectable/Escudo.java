package Recolectable;


import java.util.List;

import Entidad.Elemento;
import Graficos.BombaGrafico; 
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import State.ProtegidoTorre;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Escudo extends PowerUp{

	long tiempoCreado;
	
	public Escudo(int x, int y, Mapa m) {
		super(x, y, m);
		grafico = new BombaGrafico();
		visitor = new VisitorVacio();
	}
	
	public Escudo() {
		precio=0;
		grafico = new BombaGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado= System.currentTimeMillis();
	}

	public void afectar(Torre p) {
		p.setState(new ProtegidoTorre(p));
		muerto=true;
	}
	
	public void afectar(Enemigo p) {
	}
	
	
	@Override
	public int getInicioRangoX() {
		return x-80;
	}
	@Override
	public int getFinRangoX() {
		return x+80;
	}

	@Override
	public void agregar(Tienda tienda) {
		tienda.agregar(this);
		
	}

	public void actualizar() {
	}
}
