package Visitor;

import Disparos.Disparo;
import Entidad.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public class VisitorDisparo extends Visitor{
	protected Disparo disparo;
	
	public VisitorDisparo(Disparo d) {
		disparo = d;
	}

	@Override
	public void visit(Torre t) {	
	}

	@Override
	public void visit(Enemigo e) {
		e.disminuirVida(disparo.getDanio());
		disparo.setMuerto(true);
	}

	@Override
	public void visit(Disparo d) {
	}

	@Override
	public void visit(PowerUp p) {
		
	}

	public void visit(Obstaculo o) {
		o.disminuirVida(disparo.getDanio());
		disparo.setMuerto(true);
		
	}

}
