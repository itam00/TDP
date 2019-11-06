package Tienda;

import javax.swing.ImageIcon; 

import Juego.Mapa;
import PowerUps.Escudo;
import Recolectable.EscudoRecolectable;
import Recolectable.Recolectable;

public class ManejadorEscudo extends ManejadorPowerUp {
	
	public ManejadorEscudo(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/escudoIcono.png")));
		tiempoEspera = 5000;
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
			bloquear();
		}
	}
	
	public Recolectable getPowerUp(int x, int y, Mapa m) {
		return new EscudoRecolectable(x,y,m,this);
	}
}
