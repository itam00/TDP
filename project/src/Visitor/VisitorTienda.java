package Visitor;

import Disparos.Disparo;
import Entidad.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;
import Tienda.Tienda;

public class VisitorTienda extends Visitor{
	Tienda tienda;
	
	public VisitorTienda(Tienda tienda) {
		this.tienda = tienda;
	}
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
		p.agregar(tienda);
		p.setMuerto(true);
	}

	@Override
	public void visit(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
