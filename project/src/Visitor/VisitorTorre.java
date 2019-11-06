package Visitor;

import Disparos.Disparo; 
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import State.AtacandoTorre;

public class VisitorTorre extends Visitor{

	protected Torre mio;
	
	public VisitorTorre(Torre t) {
		mio=t;
	}
	
	@Override
	public void visit(Torre t) {
		
	}

	@Override
	public void visit(Enemigo e) {
		mio.setState(new AtacandoTorre(mio));
		
	}

	@Override
	public void visit(Disparo d) {
		//System.out.println("llega a disparo");
	}

	@Override
	public void visit(PowerUp p) {
		//System.out.println("llega a powerup");
	}

	@Override
	public void visit(Objeto o) {
		// TODO Auto-generated method stub
		
	}

}
