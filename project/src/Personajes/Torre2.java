package Personajes;


import Disparos.DisparoTorre2;
import Graficos.Torre2Grafica;
import Juego.Mapa;
import Recolectable.PowerUp;

public class Torre2 extends Torre{

	public Torre2() {
		precio = 0; //cambiar
		rango = 10;
		danio = 10;
		vida = 100;
		tamanio=1;
		frecuenciaDefault=300;
		frecuencia =frecuenciaDefault;
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			mapa.agregar(new DisparoTorre2(x,y,mapa,danio));
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre2Grafica();
		
	}



}
