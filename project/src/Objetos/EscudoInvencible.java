package Objetos;

import Graficos.ElementoGrafico;

import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import Visitor.VisitorPowerUp;

public class EscudoInvencible extends PowerUp{

	public EscudoInvencible() {
		direccionGrafico = "/Sprites/veneno.gif";
		grafico=  new ElementoGrafico(direccionGrafico);
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
