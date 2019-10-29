package Recolectable;


import java.util.List; 

import Entidad.Elemento;
import Graficos.BombaEfectoGrafico;
import Graficos.BombaGrafico; 
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import Tienda.ManejadorBomba;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Bomba extends PowerUp{
	
	public Bomba(int x, int y, Mapa m, ManejadorBomba maneja) {
		super(x, y, m, maneja);
		grafico = new BombaGrafico(maneja);
		visitor = new VisitorVacio();
	}
	
	public Bomba() {
		super();
		precio=0;
		grafico = new BombaEfectoGrafico();
		visitor= new VisitorPowerUp(this);
	}

	public void afectar(Torre p) {
		
	}
	
	public void afectar(Enemigo p) {
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-80;
	}
	@Override
	public float getFinRangoX() {
		return x+80;
	}

	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>3000) {
			List<Elemento> enRango= mapa.enRango(this);
			for (Elemento e:enRango)
				e.setMuerto(true);
			muerto=true;
		}
		muerto= (muerto || grafico.estaMuerto());
	}
}
