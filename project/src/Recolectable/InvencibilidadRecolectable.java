package Recolectable;

import Graficos.EscudoGrafico;
import Juego.Mapa;
import Tienda.ManejadorEscudo;
import Visitor.VisitorVacio;

public class InvencibilidadRecolectable extends Recolectable {
	public InvencibilidadRecolectable (int x, int y, Mapa m, ManejadorEscudo maneja) {
		super(x,y,m,maneja);
		grafico= new EscudoGrafico(maneja);
		visitor = new VisitorVacio();
	}
}
