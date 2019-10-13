package Entidad;

import GUI.Mapa;
import PersonajeGrafico.DisparoGrafico;
import Visitor.Visitor;
import Visitor.VisitorDisparo;

public class DisparoAliado extends Disparo {


	public DisparoAliado(int x, int y,Mapa m,int danio) {
		super(x, y,m);
		this.danio = danio;
		grafico=  new DisparoGrafico(x, y);
		visitor = new VisitorDisparo(this);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public int getInicioRangoX() {
		return grafico.getX()-5;
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+5;
	}
	


}
