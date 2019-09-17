package Personajes;
import Mapa.Celda;
import Recolectable.PowerUp;

public class Isaac extends Torre{

	public Isaac(Celda c) {
		super(c);
		vida= 100;
		danio= 1;
		rango= 2;
		precio= 0;//MODIFICAR LUEGO
		tamanio= 0;//CONSULTAR QUE REPRESENTA EL TAMANIO
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean detectarEnemigo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	/*@Override AGREGAR METODO CUANDO SE CREE LA CLASE POWER UP
	public void aplicarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}*/

}
