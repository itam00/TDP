package Recolectable;

 
import Graficos.PowerUpGrafico;
import Juego.Mapa;
import Tienda.ManejadorPortal;
import Visitor.VisitorVacio;

public class PortalRecolectable extends Recolectable{
	public PortalRecolectable(int x, int y, Mapa m,ManejadorPortal maneja) {
		super(x, y, m,maneja);
		direccionGrafico = "/Sprites/portalPowerUp.gif";
		grafico = new PowerUpGrafico(maneja,direccionGrafico);
		visitor = new VisitorVacio();
	}


}
