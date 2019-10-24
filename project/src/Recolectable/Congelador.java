package Recolectable; 

import Graficos.CongeladorEfectoGrafico;
import Graficos.CongeladorGrafico;

import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;
import State.CongeladoEnemigo;
import State.CongeladoTorre;
import Tienda.ManejadorCongelacion;
import Tienda.Tienda;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class Congelador extends PowerUp{

	protected long tiempoCreado;
	
	public Congelador(int x, int y, Mapa m, ManejadorCongelacion maneja) {
		super(x, y, m,maneja);
		grafico = new CongeladorGrafico(maneja);
		visitor = new VisitorVacio();
		tiempoCreado=Long.MAX_VALUE;
	}
	
	public Congelador() {
		precio=0;
		grafico = new CongeladorEfectoGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
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
		return x-500;
	}
	@Override
	public int getFinRangoX() {
		return x+500;
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>3000)
			muerto=true;
		super.actualizar();
	}

}
