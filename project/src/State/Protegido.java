package State;

import Personajes.Personaje;

public class Protegido implements State{

	protected int vidaEscudo;
	protected Personaje p;
	protected int vidapersonaje;
	
	public Protegido (Personaje p, int vida) {
		this.p=p;
		vidapersonaje=vida;
	}
	@Override
	public void actualizar() {
		vidaEscudo-=(vidapersonaje-p.getVida());
		p.setVida(vidapersonaje);
		if (vidaEscudo<=0)
			p.setState(new Default(p));		
	}

}
