package Tienda;

import javax.swing.ImageIcon;
import Juego.Mapa;
import PowerUps.Fuego;
import Recolectable.Recolectable;

public class ManejadorFuego extends ManejadorPowerUp {
	
	public ManejadorFuego(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/fuegoIcono.png")));
		tiempoEspera = 2000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new Fuego(), this);
	}

	@Override
	public void usarPowerUp() {
		if(cant>0) {
			cant--;
			tienda.setPowerUpUsado(new Fuego());
			bloquear();
		}
	}
	
	public Recolectable getRecolectable(int x, int y, Mapa m) {
		return null;
	}
	
}
