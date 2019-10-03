package Visitor;

import Entidad.Disparo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorDisparo extends Visitor{

	@Override
	public void visit(Torre t) {	
	}

	@Override
	public void visit(Enemigo e) {
		e.disminuirVida(10);
		
	}

	@Override
	public void visit(Disparo d) {
	}

	@Override
	public void visit(PowerUp p) {
		
	}

}
