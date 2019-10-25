package Tienda;

import javax.swing.ImageIcon;

import Juego.Mapa;
import Recolectable.Bomba;
import Recolectable.Escudo;
import Recolectable.PowerUp;

public class ManejadorEscudo extends ManejadorPowerUp {
	
	public ManejadorEscudo(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/escudoIcono.png")));
	}

	@Override
	public void comprar() {
		tienda.comprar(new Escudo(), this); //esto es innecesario, podes poner cant++
	}

	@Override
	public void usarPowerUp() {
		if(cant>=0) {
			cant--;
			tienda.setPowerUpUsado(new Escudo());
		}
	}
	
	public PowerUp getPowerUp(int x, int y, Mapa m) {
		cant++;
		return new Escudo(x,y,m,this);
	}
}
