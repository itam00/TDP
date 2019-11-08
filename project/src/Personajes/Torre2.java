package Personajes;

 
import Disparos.DisparoTorre2;
import Graficos.ElementoGrafico;

public class Torre2 extends Torre{

	public Torre2() {
		super();
		rango = 500;
		danio = 10;
		vida = 100;
		frecuenciaDefault=300;
		frecuencia =frecuenciaDefault;
		direccionGrafico = "/Sprites/torre2.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre2((int)x,fila*96,mapa,danio,rango));
			}
		}
	}



}
