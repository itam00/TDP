package Personajes;


import Disparos.DisparoTorre3;
import Graficos.Torre3Grafica;

public class Torre3 extends Torre{

	public Torre3() {
		precio = 0; //cambiar
		rango = 10;
		danio = 10;
		vida = 100;
		tamanio=1;
		frecuencia =300;
	}

	@Override
	public void disparar() {
		mapa.agregar(new DisparoTorre3(x,y,mapa,danio));
			
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre3Grafica();
		
	}



}
