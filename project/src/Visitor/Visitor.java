package Visitor;

import Disparos.Disparo;
import Objetos.Objeto;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public abstract class Visitor {

	public abstract void visit(Torre t);
	public abstract void visit(Enemigo e);
	public abstract void visit(Disparo  d);
	public abstract void visit(PowerUp p);
	public abstract void visit(Objeto o);
}
