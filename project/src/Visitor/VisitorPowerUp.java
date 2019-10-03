package Visitor;

import Entidad.Disparo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorPowerUp extends Visitor{

	protected PowerUp p;
	
	public VisitorPowerUp(PowerUp p) {
		this.p=p;
	}
	
	@Override
	public void visit(Torre t) {
		t.aplicarPowerUp(p);
		
	}

	@Override
	public void visit(Enemigo e) {
		e.aplicarPowerUp(p);
	}

	@Override
	public void visit(Disparo d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

}
