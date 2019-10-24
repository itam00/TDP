package Tienda;

import javax.swing.ImageIcon;

import Recolectable.Bomba;
import Recolectable.Escudo;
import Recolectable.PowerUp;

public class ManejadorEscudo extends ManejadorPowerUp {
	
	public ManejadorEscudo(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
	}

	@Override
	public void comprar() {
		tienda.comprar(new Escudo(this), this); //esto es innecesario, podes poner cant++
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new Escudo(this));
		}
	}
	
	public PowerUp crear() {
		return new Escudo(this);
	}
}
