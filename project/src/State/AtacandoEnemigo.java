package State;

import Entidad.Elemento;
import Personajes.Enemigo; 
import Personajes.Torre;

public class AtacandoEnemigo extends StateEnemigo{
	Elemento ultimoAtacado;

	public AtacandoEnemigo(Enemigo e,Elemento elem) {
		super(e);
		ultimoAtacado = elem;
	}

	@Override
	public void actualizar() {
		enemigo.atacar(ultimoAtacado);		
	}

}
