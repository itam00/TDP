package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Juego.Mapa;
import Personajes.Torre1;
import Recolectable.Congelador;
import Recolectable.PowerUp;

public class ManejadorCongelacion extends ManejadorPowerUp {
	
	public ManejadorCongelacion(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
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
		}
	}
	
	public PowerUp getPowerUp(int x, int y, Mapa m) {
		cant++;
		System.out.println("se aumento en 1 el controlador del powerup congelacion");
		return new Congelador(x, y, m, this);
	}
}
