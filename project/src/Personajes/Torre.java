package Personajes;


import Juego.Mapa;
import Visitor.Visitor;
import Visitor.VisitorTorre;

public abstract class Torre extends Personaje{
	
	protected int precio, tamanio;

	public Torre() {
		visitor=new VisitorTorre(this);
	}
	
	public void setPos(int x,int y, Mapa m) {
		crearGrafico(x,y);
		mapa=m;
		this.x=(int)(x/102)*102;
		this.y=(int)(y/96)*96;
		
	}
	
	public void setVelocidad(float v) {
	}
	
	public void setDefault() {
		frecuencia=frecuenciaDefault;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVida() {
		return vida;
	}
	
	@Override
	public int getInicioRangoX() {
		return grafico.getX();
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+rango*50;
	}
	
	public abstract void crearGrafico(int x,int y);
	
	public abstract void disparar();

}
