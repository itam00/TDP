package Visitor;

import Disparos.Disparo;
import Entidad.ObjetoMapa;
import Objetos.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public class VisitorDisparoTorre extends Visitor{
	protected Disparo disparo;
	
	public VisitorDisparoTorre(Disparo d) {
		disparo = d;
	}

	@Override
	public void visit(Torre t) {	
	}

	@Override
	public void visit(Enemigo e) {
		e.disminuirVida(disparo.getDanio());
		if(e.getMuerto()) {
			e.soltarPowerUp();
		}
		disparo.setMuerto(true);
	}

	@Override
	public void visit(Disparo d) {
	}

	@Override
	public void visit(PowerUp p) {
		
	}

	@Override
	public void visit(ObjetoMapa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Obstaculo o) {
		o.disminuirVida(disparo.getDanio());
		disparo.setMuerto(true);
		
	}

}
