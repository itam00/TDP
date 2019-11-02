package Recolectable;

import Graficos.BombaGrafico;
import Juego.Mapa;
import Tienda.ManejadorBomba;
import Visitor.VisitorVacio;

public class BombaRecolectable extends Recolectable{
	public BombaRecolectable(int x, int y, Mapa m, ManejadorBomba maneja) {
		super(x, y, m, maneja);
		grafico = new BombaGrafico(maneja);
		visitor = new VisitorVacio();
	}
}
