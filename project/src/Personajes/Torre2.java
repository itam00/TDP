package Personajes;

 
import Disparos.DisparoTorre2;
import Graficos.Torre2Grafica;

public class Torre2 extends Torre{

	public Torre2() {
		super();
		rango = 5;
		danio = 10;
		vida = 100;
		frecuenciaDefault=300;
		frecuencia =frecuenciaDefault;
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre2((int)x,fila*96,mapa,danio,rango*96));
			}
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre2Grafica();
		
	}



}
