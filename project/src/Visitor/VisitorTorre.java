package Visitor;

import Entidad.Disparo;
import Entidad.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorTorre extends Visitor{

	protected Torre mio;
	
	public VisitorTorre(Torre t) {
		mio=t;
	}
	
	@Override
	public void visit(Torre t) {
		System.out.println("llega a torre");
		
	}

	@Override
	public void visit(Enemigo e) {
		mio.atacar();
		
	}

	@Override
	public void visit(Disparo d) {
		//System.out.println("llega a disparo");
	}

	@Override
	public void visit(PowerUp p) {
		System.out.println("llega a powerup");
	}

	@Override
	public void visit(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
