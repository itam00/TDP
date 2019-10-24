package State;

import Disparos.DisparoTorre3;
import Personajes.Enemigo;
import Personajes.Torre;

public class AtacandoDistancia extends StateEnemigo{
	Torre ultimoAtacado;

	public AtacandoDistancia(Enemigo e,Torre t) {
		super(e);
		ultimoAtacado = t;
	}

	@Override
	public void actualizar() {
		if(enemigo.puedeAtacar()) {
			mapa.agregar(new DisparoTorre3(x,y,mapa,danio));
		}
		
		if(ultimoAtacado.estaMuerto()) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}
		
	}
}
