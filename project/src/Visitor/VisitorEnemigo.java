package Visitor;

import Disparos.Disparo; 
import Entidad.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import State.AtacandoEnemigo;

public class VisitorEnemigo extends Visitor {

	protected Enemigo enemigo;
	
	public VisitorEnemigo(Enemigo e) {
		enemigo= e;
	}
	
	@Override
	public void visit(Torre t) {	
		enemigo.setState(new AtacandoEnemigo(enemigo,t));
	}

	@Override
	public void visit(Enemigo e) {
	}

	@Override
	public void visit(Disparo d) {

		
	}

	@Override
	public void visit(PowerUp p) {
	}

	@Override
	public void visit(Obstaculo o) {
		enemigo.setState(new AtacandoEnemigo(enemigo,o));
	}

}
