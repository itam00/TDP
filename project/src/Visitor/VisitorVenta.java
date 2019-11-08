package Visitor;

import Disparos.Disparo;
import Entidad.ObjetoMapa;
import Objetos.Obstaculo;
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
		int valor=t.getPrecio();
		if (t.getVida()< t.getVidaMaxima())
			valor/=2;
		mio.devolver(valor);
		t.setMuerto(true);
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
