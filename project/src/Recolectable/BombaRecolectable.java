package Recolectable;

import Graficos.PowerUpGrafico;
import Juego.Mapa;
import Tienda.ManejadorBomba;
import Visitor.VisitorVacio;

public class BombaRecolectable extends Recolectable{
	public BombaRecolectable(int x, int y, Mapa m, ManejadorBomba maneja) {
		super(x, y, m, maneja);
		direccionGrafico = "/Sprites/bombaPowerUp.gif";
		grafico = new PowerUpGrafico(maneja,direccionGrafico);
		visitor = new VisitorVacio();
	}
}
