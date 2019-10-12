package Entidad;

import GUI.Mapa;
import PersonajeGrafico.DisparoGrafico;
import Visitor.Visitor;
import Visitor.VisitorDisparo;

public class DisparoAliado extends Disparo {


	public DisparoAliado(int x, int y,Mapa m) {
		super(x, y,m);
		danio=10;
		inicioRangoX=x-5;
		finRangoX=x+5;
		inicioRangoY=y-5;
		finRangoY=y+5;
		grafico=  new DisparoGrafico(x, y);
		visitor = new VisitorDisparo();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	


}
