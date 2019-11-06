package Personajes;

import Disparos.DisparoTorre5;
import Graficos.Torre5Grafica;

public class Torre5 extends Torre{
	public Torre5() {
		super();
		precio = 0; //cambiar
		rango = 5;
		danio = 20;
		vida = 100;
		frecuenciaDefault=500;
		frecuencia =frecuenciaDefault;
		cantFilas=2;
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre5((int)x,fila*96,mapa,danio,rango*96));
			}
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre5Grafica();
		
	}
}
