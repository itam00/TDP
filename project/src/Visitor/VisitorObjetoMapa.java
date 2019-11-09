package Visitor;

import Disparos.Disparo;
import Objetos.ObjetoMapa;
import Objetos.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorObjetoMapa extends Visitor {

	protected ObjetoMapa mio;
	
	public VisitorObjetoMapa(ObjetoMapa o) {
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
	public void visit(ObjetoMapa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
