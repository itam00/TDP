package PowerUps;


import java.util.List;  


import Entidad.Elemento;
import Graficos.ElementoGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import Visitor.VisitorPowerUp;

public class Bomba extends PowerUp{
	
	public Bomba() {
		super();
		direccionGrafico= "/Sprites/bombaEfecto.gif";
		grafico = new ElementoGrafico(direccionGrafico);
		visitor= new VisitorPowerUp(this);
	}

	public void afectar(Torre p) {
		
	}
	
	public void afectar(Enemigo p) {
		
	}
	
	
	@Override
	public float getInicioRangoX() {
		return x-80;
	}
	
	
	@Override
	public float getFinRangoX() {
		return x+80;
	}

	public void actualizar() {
		if (System.currentTimeMillis()-tiempoCreado>3000) {
			List<Elemento> enRango= mapa.enRango(this);
			for (Elemento e:enRango)
				e.setMuerto(true);
			muerto=true;
		}
		muerto= (muerto || grafico.estaMuerto());
	}
}
