package Personajes;
import Mapa.Celda;
import PersonajeGrafico.*;
import Recolectable.PowerUp;

public class Isaac extends Torre{

	public Isaac(int x,int y) {
		super(x,y);
		vida= 100;
		danio= 1;
		rango= 2;
		precio= 0;//MODIFICAR LUEGO
		tamanio= 0;//CONSULTAR QUE REPRESENTA EL TAMANIO
		grafico = new IsaacGrafico(x,y);
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


}
