package Tienda;

import javax.swing.ImageIcon;

import Juego.Mapa;
import Objetos.Barrera;
import PowerUps.Escudo;
import PowerUps.PortalAliado;
import PowerUps.PowerUp;
import Recolectable.PortalRecolectable;
import Recolectable.Recolectable;

public class ManejadorBarrera extends ManejadorPowerUp {
	
	public ManejadorBarrera(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/portalIcono.png")));
		tiempoEspera = 10000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new Barrera(), this); //esto es innecesario, podes poner cant++
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new Barrera());
			bloquear();
		}
	}
	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		return null;
	}
}