package Tienda;

import javax.swing.ImageIcon; 

import Juego.Mapa;
import PowerUps.Bomba;
import Recolectable.BombaRecolectable;
import Recolectable.Recolectable;

public class ManejadorBomba extends ManejadorPowerUp {
	
	public ManejadorBomba(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/bombaIcono.png")));
		tiempoEspera = 2000;
	}

	@Override
	public void comprar() {
		tienda.comprar(new Bomba(), this);
	}

	@Override
	public void usarPowerUp() {
		if(cant>0) {
			cant--;
			tienda.setPowerUpUsado(new Bomba());
			bloquear();
		}
	}
	
	public Recolectable getRecolectable(int x, int y, Mapa m) {
		cant++;
		return new BombaRecolectable(x,y,m,this);
	}
	

}
