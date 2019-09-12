
public abstract class Personaje extends Elemento{
	protected int vida,daño,rango;
	
	public Personaje(Celda c) {
		super(c);
		
	}
	
	public abstract void atacar();
	public abstract boolean detectarEnemigo();
	public abstract void aplicarPowerUp(Recolectable p);
}
