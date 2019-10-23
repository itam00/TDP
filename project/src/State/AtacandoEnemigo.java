package State;

import Personajes.Enemigo;
import Personajes.Torre;

public class AtacandoEnemigo extends StateEnemigo{
	Torre ultimoAtacado;

	public AtacandoEnemigo(Enemigo e,Torre t) {
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
