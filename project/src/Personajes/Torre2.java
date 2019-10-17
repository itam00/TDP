package Personajes;


import Entidad.DisparoTorre2;
import GUI.Mapa;
import PersonajeGrafico.Torre2Grafica;
import Recolectable.PowerUp;

public class Torre2 extends Torre{

	public Torre2() {
		precio = 0; //cambiar
		rango = 10;
		danio = 10;
		vida = 100;
		tamanio=1;
		frecuencia =300;
	}

	@Override
	public void disparar() {
		mapa.agregar(new DisparoTorre2(grafico.getX(),grafico.getY(),mapa,danio));
			
	}

	@Override
	public void crearGrafico(int x, int y) {
		grafico = new Torre2Grafica();
		
	}



}
