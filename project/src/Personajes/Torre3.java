package Personajes;

import Disparos.DisparoTorre3;
import Graficos.ElementoGrafico;

public class Torre3 extends Torre{

	public Torre3() {
		super();
		rango = 600;
		danio = 9;
		vida = 150;
		vidaMaxima=vida;
		frecuenciaDefault=800;
		frecuencia =frecuenciaDefault;
		direccionGrafico = "/Sprites/torre3.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre3((int)x,fila*96,mapa,danio,rango));
			}
		}
	}

	@Override
	public int getPrecio() {
		return 100;
	}

	


}
