package Entidad;

import PersonajeGrafico.DisparoGrafico;

public class DisparoAliado extends Disparo {

	public DisparoAliado(int x, int y) {
		super(x, y);
		grafico=  new DisparoGrafico(this.x, this.y);
	}

	@Override
	public void actualizar() {
		grafico.actualizar();
		//esto podría estar en la interfaz directamente, todos lo tienen que comprobar.
		if (grafico.estaMuerto())
			muerto=true;
	}
	

}
