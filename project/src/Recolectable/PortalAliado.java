package Recolectable;

import Graficos.BombaEfectoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUp;

public class PortalAliado extends PowerUp{
	
	public PortalAliado() {
		super();
		precio=0;
		//grafico = new PortalIzquierdoGrafico();
		visitor= new VisitorPowerUp(this);
	}

	@Override
	public void afectar(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInicioRangoX() {
		return x-10;
	}

	@Override
	public int getFinRangoX() {
		return x+10;
	}

}
