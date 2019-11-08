package Recolectable;

 
import Graficos.PowerUpGrafico;
import Juego.Mapa;
import Tienda.ManejadorEscudo;
import Visitor.VisitorVacio;

public class EscudoRecolectable extends Recolectable{
	public EscudoRecolectable(int x, int y, Mapa m,ManejadorEscudo maneja) {
		super(x, y, m,maneja);
		direccionGrafico = "/Sprites/escudoPowerUp.gif";
		grafico = new PowerUpGrafico(maneja,direccionGrafico);
		visitor = new VisitorVacio();
	}

}
