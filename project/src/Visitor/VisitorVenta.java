package Visitor;

import Disparos.Disparo;
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Tienda.Tienda;

public class VisitorVenta extends Visitor {

	protected Tienda mio;
	
	public VisitorVenta(Tienda t) {
		mio=t;
	}

	@Override
	public void visit(Torre t) {
		t.setMuerto(true);
		mio.devolver(t);
		
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
	public void visit(Objeto o) {
		// TODO Auto-generated method stub
		
	}
}
