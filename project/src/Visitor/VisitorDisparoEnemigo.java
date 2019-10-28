package Visitor;

import Disparos.Disparo;
import Entidad.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorDisparoEnemigo extends Visitor {
	protected Disparo disparo;
	
	public VisitorDisparoEnemigo(Disparo d) {
		disparo = d;
	}

	@Override
	public void visit(Torre t) {
		t.disminuirVida(disparo.getDanio());
		disparo.setMuerto(true);
	}

	@Override
	public void visit(Enemigo e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Disparo d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(PowerUp p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Obstaculo o) {
		o.disminuirVida(disparo.getDanio());
		disparo.setMuerto(true);
		
	}

}
