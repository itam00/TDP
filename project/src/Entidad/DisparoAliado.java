package Entidad;

import PersonajeGrafico.DisparoGrafico;
import Visitor.Visitor;

public class DisparoAliado extends Disparo {

	public DisparoAliado(int x, int y) {
		super(x, y);
		danio=10;
		grafico=  new DisparoGrafico(x, y);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
