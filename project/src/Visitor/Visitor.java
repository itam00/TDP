package Visitor;

import Disparos.Disparo;
import Entidad.ObjetoMapa;
import Objetos.Obstaculo;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;

public abstract class Visitor {

	public abstract void visit(Torre t);
	public abstract void visit(Enemigo e);
	public abstract void visit(Disparo  d);
	public abstract void visit(PowerUp p);
	public abstract void visit(ObjetoMapa o);
	public abstract void visit (Obstaculo o);
}
