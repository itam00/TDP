package Tienda;

import javax.swing.ImageIcon;

import Juego.Mapa;
import Recolectable.Escudo;
import Recolectable.PortalAliado;
import Recolectable.PowerUp;

public class ManejadorPortal extends ManejadorPowerUp {
	
	public ManejadorPortal(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/escudoIcono.png")));
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
		}
	}
	
	public PowerUp getPowerUp(int x, int y, Mapa m) {
		cant++;
		return new PortalAliado(x,y,m,this);
	}
}