package Visitor;

import Disparos.Disparo;
import Entidad.Obstaculo;
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
		p.afectar(t);
	}

	@Override
	public void visit(Enemigo e) {
		p.afectar(e);
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
		// TODO Auto-generated method stub
		
	}

}
