package Visitor;

import Disparos.Disparo;
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorObjeto extends Visitor {

	Objeto mio;
	
	public VisitorObjeto(Objeto o) {
		mio=o;
	}
	
	@Override
	public void visit(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Enemigo e) {
		mio.afectar(e);
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
	public void visit(Objeto o) {
		// TODO Auto-generated method stub
		
	}

}
