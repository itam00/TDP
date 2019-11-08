package Entidad; 
import Graficos.ElementoGraficoConcreto;
import Juego.Mapa;
import Personajes.Enemigo;
import Personajes.Torre;
public class Lago extends ObjetoMapa{

	protected long tiempoCreado,ultimoAfectar;
	protected int duracion;
	protected int frecuencia,daño;
	
	public Lago(int x, int y, Mapa m) {
		super(x,y,m);
		direccionGrafico="/Sprites/charco.gif";
		grafico = new ElementoGraficoConcreto(direccionGrafico);
		grafico.setLocation(x, y);
		tiempoCreado=System.currentTimeMillis();
		duracion=7500;
		ultimoAfectar=0;
		frecuencia=200;
		daño=2;
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
