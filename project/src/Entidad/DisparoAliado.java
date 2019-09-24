package Entidad;

import PersonajeGrafico.DisparoGrafico;

public class DisparoAliado extends Disparo {

	public DisparoAliado(int x, int y) {
		super(x, y);
		grafico=  new DisparoGrafico(x, y);
	}

}
