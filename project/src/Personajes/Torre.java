package Personajes;

<<<<<<< Updated upstream
=======
import Entidad.DisparoAliado;
import GUI.Mapa;
import Visitor.Visitor;
import Visitor.VisitorTorre;

>>>>>>> Stashed changes
public abstract class Torre extends Personaje{
	
	protected int precio, tamanio;
	protected int x,y;
	public Torre(int x, int y, Mapa m) {
		super(x, y,m);
		this.x=x;
		this.y=y;
		visitor=new VisitorTorre(this);
		// TODO Auto-generated constructor stub
	}
<<<<<<< Updated upstream
=======
	
	public Torre() {
		visitor=new VisitorTorre(this);
	}
	
	public abstract void setPos(int x,int y, Mapa m);
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void atacar() {
		System.out.println("aca llega");
		DisparoAliado d= new DisparoAliado(x,y,mapa);
		mapa.agregar(d);
	}
	
	public int getPrecio() {
		return precio;
	}
>>>>>>> Stashed changes



}
