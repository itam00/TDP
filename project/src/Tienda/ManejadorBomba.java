package Tienda;

import javax.swing.ImageIcon;

import Recolectable.Bomba;
import Recolectable.PowerUp;

public class ManejadorBomba extends ManejadorPowerUp {
	
	public ManejadorBomba(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
	}

	@Override
	public void comprar() {
		tienda.comprar(new Bomba(this), this);
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new Bomba(this));
		}
	}
	
	public PowerUp crear() {
		return new Bomba(this);
	}
}
