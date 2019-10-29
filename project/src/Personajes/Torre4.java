package Personajes;


import Disparos.DisparoTorre1;
import Disparos.DisparoTorre4;
import Entidad.Elemento;
import Graficos.Torre4Grafica;

public class Torre4 extends Torre{

	
	
	public Torre4() {
		super();
		precio = 0; //cambiar
		rango = 5;
		danio = 20;
		vida = 100;
		frecuenciaDefault=500;
		frecuencia =frecuenciaDefault;
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre4((int)x,fila*96,mapa,danio,rango*96));
			}
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre4Grafica();
		
	}



}
