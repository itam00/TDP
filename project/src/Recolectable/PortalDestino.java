package Recolectable;

import Entidad.Elemento;
import Graficos.ElementoGrafico;
import Graficos.PortalDerechoEfectoGrafico;
import Graficos.PortalGrafico;
import Graficos.PortalIzquierdoEfectoGrafico;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
import State.DefaultEnemigo;
import Tienda.ManejadorPortal;
import Visitor.Visitor;
import Visitor.VisitorPowerUp;
import Visitor.VisitorVacio;

public class PortalDestino extends Elemento{
	protected int duracion;
	protected long tiempoCreado;
	
	public PortalDestino(int x, int y, Mapa m,int duracion) {
		super(x,y,m);
		grafico = new PortalIzquierdoEfectoGrafico();
		visitor = new VisitorVacio();
		tiempoCreado = System.currentTimeMillis();
		this.duracion = duracion;
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>duracion) {
			muerto=true;
		}
		muerto=(muerto || grafico.estaMuerto());
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getInicioRangoX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getFinRangoX() {
		// TODO Auto-generated method stub
		return 0;
	}



}