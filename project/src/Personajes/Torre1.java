package Personajes;

import Disparos.DisparoTorre1;
import Graficos.Torre1Grafica;
import Juego.Mapa; 
import Recolectable.PowerUp;

public class Torre1 extends Torre{
	
	public Torre1() {
		super();
		precio = 0; //cambiar
		rango = 15;
		danio = 10;
		vida =2000;
		tamanio=1;
		cantFilas=6;
		frecuenciaDefault=400;
		frecuencia = frecuenciaDefault;
	}
	
	
	@Override
	public void disparar() {
		if(puedeAtacar()) {
			mapa.agregar(new DisparoTorre1(x,y,mapa,danio));
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre1Grafica(x,y);
	}

	
	
	


}
