package Visitor;

import Entidad.Disparo;
import Entidad.Elemento;
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
		if(mio.puedeAtacar()) {
			t.disminuirVida(mio.getDanio());
			if(!t.estaMuerto()) {
				mio.setQuieto(true);
				mio.setUltimoAtacado(t);
			}
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
		if(mio.puedeAtacar()) {
			o.disminuirVida(mio.getDanio());
			if(!o.estaMuerto()) {
				mio.setQuieto(true);
				mio.setUltimoAtacado(o);
			}
		}
	}

}
