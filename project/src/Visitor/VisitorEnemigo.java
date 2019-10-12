package Visitor;

import Entidad.Disparo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorEnemigo extends Visitor {

	protected Enemigo mio;
	
	public VisitorEnemigo(Enemigo e) {
		mio= e;
	}
	
	@Override
	public void visit(Torre t) {
		mio.setQuieto(true);
		System.out.println("ME frene");
		
		
	}

	@Override
	public void visit(Enemigo e) {
		System.out.println("llega a enemigo");
	}

	@Override
	public void visit(Disparo d) {
		System.out.println("llega a disparo");
		
	}

	@Override
	public void visit(PowerUp p) {
		System.out.println("llega a powerup");
		
	}

}
