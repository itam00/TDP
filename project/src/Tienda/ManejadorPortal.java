package Tienda;

import javax.swing.ImageIcon; 

import Juego.Mapa;
import PowerUps.PortalAliado;
import Recolectable.PortalRecolectable;
import Recolectable.Recolectable;

public class ManejadorPortal extends ManejadorPowerUp {
	
	public ManejadorPortal(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/portalIcono.png")));
		tiempoEspera = 10000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new PortalAliado(), this); //esto es innecesario, podes poner cant++
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new PortalAliado());
			bloquear();
		}
	}
	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		cant++;
		return new PortalRecolectable(x,y,m,this);
	}
}