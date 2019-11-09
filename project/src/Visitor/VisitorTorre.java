package Visitor;

import Disparos.Disparo;
import Objetos.ObjetoMapa;
import Objetos.Obstaculo;
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
	}

	@Override
	public void visit(PowerUp p) {
	}

	@Override
	public void visit(ObjetoMapa o) {
		
	}

	@Override
	public void visit(Obstaculo o) {
		
	}



}
