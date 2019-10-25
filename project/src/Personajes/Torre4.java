package Personajes;


import Disparos.DisparoTorre4;
import Entidad.Elemento;
import Graficos.Torre4Grafica;

public class Torre4 extends Torre{

	
	
	public Torre4() {
		precio = 0; //cambiar
		rango = 10;
		danio = 20;
		vida = 100;
		tamanio=1;
		frecuenciaDefault=500;
		frecuencia =frecuenciaDefault;
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			mapa.agregar(new DisparoTorre4(x,y,mapa,danio));
		}
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre4Grafica();
		
	}



}
