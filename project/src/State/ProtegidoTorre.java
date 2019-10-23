package State;

import Personajes.Personaje;
import Personajes.Torre;

public class ProtegidoTorre extends StateTorre{

	protected int vidaEscudo;
	protected Personaje p;
	protected int vidapersonaje;
	
	public ProtegidoTorre (Personaje p, int vida,Torre t) {
		super(t);
		this.p=p;
		vidapersonaje=vida;
	}
	@Override
	public void actualizar() {
		vidaEscudo-=(vidapersonaje-p.getVida());
		//torre.setVida(vidapersonaje);
		if (vidaEscudo<=0)
			torre.setState(new DefaultTorre(torre));		
	}

}
;