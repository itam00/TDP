package State;

import Personajes.Enemigo;
import PowerUps.Escudo;

public class ProtegidoEnemigo extends StateEnemigo{

	protected int vidaEscudo;
	protected long tiempoCreado;
	
	public ProtegidoEnemigo (Enemigo e) {
		super(e);
		vidaEscudo=100;
		tiempoCreado= System.currentTimeMillis();
	}
	
	@Override
	public void actualizar() {
		if (vidaEscudo<=0 || System.currentTimeMillis()-tiempoCreado>10000) {
			enemigo.setState(new DefaultEnemigo(enemigo));
		}
	}
	
	public void disminuirVida(int n) {
		vidaEscudo-=n;
		if (vidaEscudo<0) {
			enemigo.aplicarDaño(n+vidaEscudo); //vidaEscudo es numero negativo (<0)
			System.out.println("llegue");
		}
	}

}