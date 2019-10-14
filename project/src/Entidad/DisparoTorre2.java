package Entidad;

import GUI.Mapa;
import PersonajeGrafico.DisparoGrafico2;

public class DisparoTorre2 extends Disparo {


	public DisparoTorre2(int x, int y,Mapa m,int danio) {
		super(x, y,m,danio);
		grafico=  new DisparoGrafico2(x, y);
	}


	@Override
	public int getInicioRangoX() {
		return grafico.getX()-7;
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+7;
	}
	


}
