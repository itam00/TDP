package State;

import Personajes.Personaje;
import Personajes.Torre;
import Recolectable.Escudo;

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
		}
	}
	
	public void disminuirVida(int n) {
		vidaEscudo-=n;
		if (vidaEscudo<0) {
			torre.aplicarDa�o(n);
			System.out.println("llegue");
		}
	}

}