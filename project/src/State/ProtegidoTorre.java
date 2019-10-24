package State;

import Personajes.Personaje;
import Personajes.Torre;

public class ProtegidoTorre extends StateTorre{

	protected int vidaEscudo;
	protected long tiempoCreado;
	
	public ProtegidoTorre (Torre t) {
		super(t);
		vidaEscudo=100;
		tiempoCreado= System.currentTimeMillis();
	}
	
	@Override
	public void actualizar() {
		if (vidaEscudo<=0 || System.currentTimeMillis()-tiempoCreado>10000) {
			torre.setState(new DefaultTorre(torre));
			System.out.println("ya no tengo escudo xdxd");
		}
		else
			System.out.println("tengo escudo xdxd");
	}
	
	public void disminuirVida(int n) {
		vidaEscudo-=n;
		if (vidaEscudo<0)
			torre.disminuirVida(n+vidaEscudo);
	}

}