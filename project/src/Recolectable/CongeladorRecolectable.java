package Recolectable;

import Graficos.PowerUpGrafico;
import Juego.Mapa;
import Tienda.ManejadorCongelacion;
import Visitor.VisitorVacio;

public class CongeladorRecolectable extends Recolectable{
	public CongeladorRecolectable(int x, int y, Mapa m, ManejadorCongelacion maneja) {
		super(x, y, m,maneja);
		grafico = new PowerUpGrafico(maneja,"/Sprites/congelacionPowerUp.gif");
		visitor = new VisitorVacio();
		tiempoCreado=Long.MAX_VALUE;
	}


}
