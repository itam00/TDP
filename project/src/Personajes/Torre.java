package Personajes;


import Visitor.Visitor; 
import GUI.Mapa;
import Visitor.Visitor;
import Visitor.VisitorTorre;

public abstract class Torre extends Personaje{
	
	protected int precio, tamanio;
	protected int x,y;
	public Torre(int x, int y, Mapa m) {
		super(x, y,m);
		this.x=x;
		this.y=y;
		visitor=new VisitorTorre(this);
		ultimoAtaque = 0;
		// TODO Auto-generated constructor stub
	}

	public Torre() {
		visitor=new VisitorTorre(this);
	}
	
	public void setPos(int x,int y, Mapa m) {
		crearGrafico(x,y);
		mapa=m;
		this.x=grafico.getX();
		this.y=grafico.getY();
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
	
	public abstract void crearGrafico(int x,int y);
	
	public abstract void disparar();
	@Override
	public int getInicioRangoX() {
		return grafico.getX();
	}

	@Override
	public int getFinRangoX() {
		return grafico.getX()+rango*50;
	}



}
