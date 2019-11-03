package Tienda;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Juego.Mapa;
import Objetos.Fuego;
import Personajes.Torre1;
import PowerUps.Congelador;
import PowerUps.EscudoInvenciblePlacebo;
import PowerUps.PowerUp;
import Recolectable.Recolectable;

public class ManejadorEscudoInvencible extends ManejadorPowerUp {
	
	public ManejadorEscudoInvencible(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
		tiempoEspera = 2000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new EscudoInvenciblePlacebo(), this);
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new EscudoInvenciblePlacebo());
			bloquear();
		}
	}
	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		return null;
	}
	
}
