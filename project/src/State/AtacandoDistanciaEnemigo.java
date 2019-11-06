package State;

import Personajes.Enemigo;
import Personajes.Torre;

public class AtacandoDistanciaEnemigo extends StateEnemigo{
	Torre ultimoAtacado;

	public AtacandoDistanciaEnemigo(Enemigo e,Torre t) {
		super(e);
		ultimoAtacado = t;
	}

	@Override
	public void actualizar() {
		if(enemigo.puedeAtacar()) {
			//mapa.agregar(new DisparoTorre3(x,y,mapa,danio));
		}
		
		if(ultimoAtacado.estaMuerto()) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}
		
	}
}
