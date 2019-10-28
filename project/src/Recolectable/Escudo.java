package Recolectable;


import java.util.List;

import Entidad.Elemento;
import Graficos.BombaEfectoGrafico;
import Graficos.BombaGrafico;
import Graficos.EscudoEfectoGrafico;
import Graficos.EscudoGrafico;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import State.ProtegidoTorre;
import Tienda.ManejadorEscudo;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Escudo extends PowerUp{

	protected long tiempoCreado;
	
	public Escudo(int x, int y, Mapa m,ManejadorEscudo maneja) {
		super(x, y, m,maneja);
		grafico = new EscudoGrafico(maneja);
		visitor = new VisitorVacio();
	}
	
	public Escudo() {
		precio=0;
		grafico = new EscudoEfectoGrafico();
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


	public void actualizar() {
		super.actualizar();
	}
}
