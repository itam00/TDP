package Entidad;

public class Celda {
	protected int x;
	protected int y;
	protected Elemento elem;
	
	public Celda(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setElem(Elemento e) {
		elem = e;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
