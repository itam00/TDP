package Objetos;

import Graficos.EscudoInvencibleGrafico;
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Visitor.VisitorPowerUp;

public class EscudoInvencible extends PowerUp{

	public EscudoInvencible() {
		precio=0;
		grafico = new EscudoInvencibleGrafico();
		visitor= new VisitorPowerUp(this);
		tiempoCreado=System.currentTimeMillis();
		duracion=-Integer.MAX_VALUE;
	}
	
	@Override
	public void afectar(Enemigo e) {
		
		e.setMuerto(true);
		muerto=true;
		
	}

	@Override
	public void afectar(Torre t) {
	}

	@Override
	public float getInicioRangoX() {
		return x;
	}

	@Override
	public float getFinRangoX() {
		return x+70;
	}

	public void actualizar() {
	}
}