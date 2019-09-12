
public class Isaac extends Personaje{
	

	public Isaac(Celda c) {
		super(c);
		vida =100;
		daño = 1;
		rango = 2;
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean detectarEnemigo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicarPowerUp(Recolectable p) {
		// TODO Auto-generated method stub
		
	}

}
