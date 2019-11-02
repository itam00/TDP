package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Juego.Mapa;
import Personajes.Torre1;
import PowerUps.Congelador;
import PowerUps.PowerUp;
import Recolectable.CongeladorRecolectable;
import Recolectable.Recolectable;

public class ManejadorCongelacion extends ManejadorPowerUp {
	
	public ManejadorCongelacion(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
		tiempoEspera = 2000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new Congelador(), this);
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new Congelador());
			bloquear();
		}
	}
	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		return new CongeladorRecolectable(x, y, m, this);
	}
	
}
