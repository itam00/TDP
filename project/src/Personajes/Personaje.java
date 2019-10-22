package Personajes;
import Recolectable.*;
import State.Default;
import State.State;
import Entidad.Elemento;
import Juego.Mapa;

public abstract class Personaje extends Elemento{
	protected int vida, danio, rango,frecuencia, frecuenciaDefault;
	protected long ultimoAtaque;
	protected State estado;
	

	public Personaje(int x, int y,Mapa m) {
		super(x,y,m);
		estado=new Default(this);
	}
	
	public Personaje() {
		estado=new Default(this);
	}
	
	public void disminuirVida(int n) {
		vida-=n;
		muerto = vida<=0;
	}
	
	public void setVida(int n) {
		vida=n;
	}
	
	public void setState(State s) {
		estado=s;
	}
	
	public void setFrecuencia(int f) {
		frecuencia=f;
	}
	
	public abstract void setVelocidad( float v);
	
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
	
	public void actualizar() {
		estado.actualizar();
		super.actualizar();
	}
}
