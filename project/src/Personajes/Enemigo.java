package Personajes;


import Entidad.Elemento;  
import Juego.Mapa;
import State.DefaultEnemigo;
import State.StateEnemigo;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa;
	protected float velocidad, velocidadDefault;
	protected boolean quieto;
	protected final float probCongelacion;
	protected StateEnemigo state;
	
	
	public Enemigo(int x, int y, Mapa m) {
		super(x,y,m);
		mapa = m;
		visitor= new VisitorEnemigo(this);
		probCongelacion = 0.8f;
		state = new DefaultEnemigo(this);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void disminuirVida(int n) {
		state.disminuirVida(n);
	}
	
	public void aplicarDaño(int n) {
		vida-=n;
		muerto=vida<=0;
		if(muerto) {
			mapa.incrementarDerrotados(recompensa,puntos);
		}
	}

	
	public void setQuieto(boolean q) {
		quieto=q;
	}
	
	public boolean getQuieto() {
		return quieto;
	}

	
	public float getInicioRangoX() {
		return grafico.getX();
	}
	
	public float getFinRangoX() {
		return grafico.getX()-rango*50;
	}
	
	
	public float getVelocidad() {
		return velocidad;
	}

	
	public void setDefault() {
		frecuencia=frecuenciaDefault;
		velocidad=velocidadDefault;
	}
	

	public void soltarPowerUp() {
		if(Math.random()<probCongelacion) {
			mapa.soltarPowerUp((int)x,(int)y);
		}
	}
	
	public void setState(StateEnemigo state) {
		this.state = state;
	}
	
	public void actualizar() {
		grafico.actualizar(x,y);
		state.actualizar();
	}
	
	public void atacar(Elemento elem) {
		elem.disminuirVida(danio);
	}
	
	public void mover() {
		x-=velocidad;
		if(x<0) {
			mapa.enemigoLlegaFinMapa();
		}
	}
	
	public void ralentizar() {
		state.ralentizar();
	}

	public void setVelocidad(float v) {
		velocidad=v;
		
	}
}
