package Recolectable;

import Graficos.CongeladorGrafico; 
import Juego.Mapa;
import Tienda.ManejadorCongelacion;
import Visitor.VisitorVacio;

public class CongeladorRecolectable extends Recolectable{
	public CongeladorRecolectable(int x, int y, Mapa m, ManejadorCongelacion maneja) {
		super(x, y, m,maneja);
		grafico = new CongeladorGrafico(maneja);
		visitor = new VisitorVacio();
		tiempoCreado=Long.MAX_VALUE;
	}


}
