package Personajes;


import Disparos.DisparoTorre4;
import Graficos.Torre4Grafica;

public class Torre4 extends Torre{

	public Torre4() {
		precio = 0; //cambiar
		rango = 10;
		danio = 10;
		vida = 100;
		tamanio=1;
		frecuencia =300;
	}

	@Override
	public void disparar() {
		mapa.agregar(new DisparoTorre4(x,y,mapa,danio));
			
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre4Grafica();
		
	}



}
