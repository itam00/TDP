package Visitor;

import Disparos.Disparo;
import Entidad.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorPowerUp extends Visitor{

	protected PowerUp mio;
	
	public VisitorPowerUp(PowerUp mio) {
		this.mio=mio;
	}
	
	@Override
	public void visit(Torre t) {
		mio.afectar(t);
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
	public void visit(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
