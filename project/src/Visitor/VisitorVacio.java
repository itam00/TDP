package Visitor;

import Disparos.Disparo;
import Objetos.ObjetoMapa;
import Objetos.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorVacio extends Visitor {
	public VisitorVacio() {}

	@Override
	public void visit(Torre t) {
		// TODO Auto-generated method stub

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
	public void visit(ObjetoMapa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
