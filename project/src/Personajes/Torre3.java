package Personajes;


import Disparos.DisparoTorre1;
import Disparos.DisparoTorre3;
import Graficos.Torre3Grafica;

public class Torre3 extends Torre{

	public Torre3() {
		super();
		precio = 0; //cambiar
		rango = 10;
		danio = 30;
		vida = 100;
		tamanio=1;
		frecuenciaDefault=800;
		frecuencia =frecuenciaDefault;
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre3((int)x,fila*96,mapa,danio,rango*96));
			}
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre3Grafica();
		
	}

	


}
