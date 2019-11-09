package Objetos; 
import Graficos.ElementoGrafico; 
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
public class Lago extends ObjetoMapa{

	protected long tiempoCreado,ultimoAfectar;
	protected int duracion;
	protected int frecuencia;
	
	public Lago(int x, int y, Mapa m) {
		super(x,y,m);
		direccionGrafico="/Sprites/charco.gif";
		grafico = new ElementoGrafico(direccionGrafico);
		grafico.setLocation(x, y);
		tiempoCreado=System.currentTimeMillis();
		duracion=15500;
		ultimoAfectar=0;
		frecuencia=200;
	}

	public void afectar(Torre p) {
		//a las torres no las afecta.
	}
	
	public void afectar(Enemigo p) {
		p.ralentizar();
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-70;
	}
	
	@Override
	public float getFinRangoX() {
		return x+70;
	}
	
	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>duracion) {
			muerto=true;
		}
	}

}
