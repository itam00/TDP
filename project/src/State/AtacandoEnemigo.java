package State;

import Entidad.Elemento; 
import Personajes.Enemigo; 

public class AtacandoEnemigo extends StateEnemigo{
	Elemento ultimoAtacado;

	public AtacandoEnemigo(Enemigo e,Elemento elem) {
		super(e);
		ultimoAtacado = elem;
	}

	@Override
	public void actualizar() {
		if(enemigo.puedeAtacar()) {
			enemigo.atacar(ultimoAtacado);
		}

		if(ultimoAtacado.estaMuerto()) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}
	}

}
