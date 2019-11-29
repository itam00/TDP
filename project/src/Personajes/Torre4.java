package Personajes;


import Disparos.DisparoTorre4;
import Graficos.ElementoGrafico;
public class Torre4 extends Torre{

	
	
	public Torre4() {
		super();
		rango = 700;
		danio = 7;
		vida = 150;
		vidaMaxima=vida;
		frecuenciaDefault=500;
		frecuencia =frecuenciaDefault;
		direccionGrafico = "/Sprites/torre4.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
	}

	@Override
	public void disparar() {
		if(puedeAtacar()) {
			for (Integer fila:filas) {
				mapa.agregar(new DisparoTorre4((int)x,fila*96,mapa,danio,rango));
			}
		}
	}

	@Override
	public int getPrecio() {
		return 70;
	}





}
