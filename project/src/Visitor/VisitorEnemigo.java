package Visitor;

import Entidad.Disparo;
import Entidad.Obstaculo;
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
		Torre ultimo = mio.getUltimoAtacado();
		
		
		if(ultimo!=null) {
			mio.atacar();
		}
		else {
			mio.setQuieto(true);
			mio.setUltimoAtacado(t);
		}
		 
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
		System.out.println("chocó contra un obstaculo");
		o.disminuirVida(mio.getDanio());
		
	}

}
