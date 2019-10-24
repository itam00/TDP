package Personajes;


import Entidad.Elemento;
import Juego.Mapa;
import Recolectable.Congelador;
import State.DefaultEnemigo;
import State.StateEnemigo;
import State.StateTorre;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje{
	protected int puntos, recompensa;
	protected float velocidad, velocidadDefault;
	protected boolean quieto;
	protected Elemento ultimoAtacado;
	protected final float probCongelacion;
	protected StateEnemigo state;
	
	
	public Enemigo(int x, int y, Mapa m) {
		super(x,y,m);
		mapa = m;
		ultimoAtacado=null;
		visitor= new VisitorEnemigo(this);
		probCongelacion = 0.8f;
		state = new DefaultEnemigo(this);
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public int getRecompensa() {
		return recompensa;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	public int limiteRango() {
		return getX()-rango;
	}

	
	public void setQuieto(boolean q) {
		quieto=q;
	}
	
	public boolean getQuieto() {
		return quieto;
	}

	
	public int getInicioRangoX() {
		return grafico.getX();
	}
	
	public int getFinRangoX() {
		return grafico.getX()-rango*50;
	}
	
	public Elemento getUltimoAtacado() {
		return ultimoAtacado;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setUltimoAtacado(Elemento e) {
		ultimoAtacado = e;
	}
	
	public void setDefault() {
		frecuencia=frecuenciaDefault;
		velocidad=velocidadDefault;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void soltarPowerUp() {
		if(Math.random()<probCongelacion) {
			mapa.soltarPowerUp(x,y);
			System.out.println("se solto un congelador");
		}
	}
	public void setState(StateEnemigo state) {
		this.state = state;
	}
	
	public void actualizar() {
		state.actualizar();
	}
}
