package State;

import Entidad.Obstaculo;
import Personajes.Enemigo;

public class AtacandoEnemigoObstaculo extends StateEnemigo{
	Obstaculo ultimoAtacado;

	public AtacandoEnemigoObstaculo(Enemigo e,Obstaculo t) {
		super(e);
		ultimoAtacado = t;
	}

	@Override
	public void actualizar() {
		if(enemigo.puedeAtacar()) {
			ultimoAtacado.disminuirVida(enemigo.getDanio());
		}
		if(ultimoAtacado.estaMuerto()) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}
	}
}
