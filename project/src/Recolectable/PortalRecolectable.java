package Recolectable;

import Graficos.PortalGrafico; 
import Juego.Mapa;
import Tienda.ManejadorPortal;
import Visitor.VisitorVacio;

public class PortalRecolectable extends Recolectable{
	public PortalRecolectable(int x, int y, Mapa m,ManejadorPortal maneja) {
		super(x, y, m,maneja);
		grafico = new PortalGrafico(maneja);
		visitor = new VisitorVacio();
	}


}
