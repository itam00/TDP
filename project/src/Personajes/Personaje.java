package Personajes;
import Entidad.Elemento;
import Juego.Mapa;

public abstract class Personaje extends Elemento{
	protected int vida, danio, rango,frecuencia, frecuenciaDefault;
	
	protected long ultimoAtaque;
	

	public Personaje(int x, int y,Mapa m) {
		super(x,y,m);
	}
	
	public Personaje() {
		super();
	}
	
	public abstract void setDefault();
	
	public boolean getMuerto() {
		return vida<=0;
	}
	
	public int getDanio() {
		return danio;
	}
	
	public int getVida() {
		return vida;
	}
	
	public boolean puedeAtacar() {
		boolean puede=System.currentTimeMillis()-ultimoAtaque>frecuencia;
		if(puede) {
			ultimoAtaque = System.currentTimeMillis();
		}
		return puede;
	}
	

}
