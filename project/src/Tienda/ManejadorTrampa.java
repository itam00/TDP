package Tienda;


import javax.swing.ImageIcon;

import Juego.Mapa;
import PowerUps.Trampa;
import Recolectable.Recolectable;

public class ManejadorTrampa extends ManejadorPowerUp {
	
	public ManejadorTrampa(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
		tiempoEspera = 2000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new Trampa(), this);
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new Trampa());
			bloquear();
		}
	}
	
	public Recolectable getRecolectable(int x, int y, Mapa m) {
		return null;
	}
	
}
