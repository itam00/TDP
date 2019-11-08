package Personajes;

import Entidad.Comprable;
import Juego.Mapa;
import State.DefaultTorre;
import State.StateTorre;
import Visitor.Visitor;
import Visitor.VisitorTorre;

public abstract class Torre extends Personaje implements Comprable{
	protected StateTorre state;
	public Torre() {
		super();
		visitor=new VisitorTorre(this);
		state = new DefaultTorre(this);
	}
	
	public void setPos(int x,int y, Mapa m) {
		super.setPos(x,y,m);
		crearGrafico(x,y);
		this.x=(int)(x/102)*102;
		
	}
	
	public void setVelocidad(float v) {
	}
	
	public void setDefault() {
		frecuencia=frecuenciaDefault;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void disminuirVida(int n) {
		state.disminuirVida( n);
	}
	
	public void aplicarDaño(int n) {
		vida-=n;
		muerto=vida<=0;
	}
	
	public int getPrecio() {
		return 0;
	}
	
	public int getVida() {
		return vida;
	}
	
	@Override
	public float getInicioRangoX() {
		return x;
	}

	@Override
	public float getFinRangoX() {
		return x+rango*100;
	}
	
	public void setState(StateTorre state) {
		this.state = state;
	}
	
	public abstract void crearGrafico(int x,int y);
	
	public abstract void disparar();
	
	public void actualizar() {
		state.actualizar();
	}

}
