package Recolectable;

import java.awt.event.MouseEvent;

import Graficos.BombaGrafico;
import Graficos.CongeladorEfectoGrafico;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.ManejadorBomba;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Bomba extends PowerUp{

	public Bomba(int x, int y, Mapa m, ManejadorBomba maneja) {
		super(x, y, m,maneja);
		grafico = new BombaGrafico();
		visitor = new VisitorVacio();
	}
	
	public Bomba() {
		precio=0;
		grafico = new CongeladorEfectoGrafico();
		visitor= new VisitorPowerUp(this);
	}

	public void afectar(Torre p) {
		p.setMuerto(true);;
	}
	
	public void afectar(Enemigo p) {
		p.setMuerto(true);
	}
	
	
	@Override
	public int getInicioRangoX() {
		return x-20;
	}
	@Override
	public int getFinRangoX() {
		return x+20;
	}

	@Override
	public void agregar(Tienda tienda) {
		tienda.agregar(this);
		
	}

}
