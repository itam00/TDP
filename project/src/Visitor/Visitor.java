package Visitor;

import Entidad.Disparo;
import Personajes.Enemigo;
import Personajes.Torre;
import Recolectable.PowerUp;

public abstract class Visitor {

	public abstract void visit(Torre t);
	public abstract void visit(Enemigo e);
	public abstract void visit(Disparo  d);
	public abstract void visit(PowerUp p);
}
