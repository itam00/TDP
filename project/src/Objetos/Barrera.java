package Objetos;

import Graficos.BarreraGrafico; 
import Personajes.Enemigo;
import Personajes.Torre;
import PowerUps.PowerUp;
import State.AtacandoEnemigo;
import State.AtacandoTorre;
import Visitor.VisitorPowerUp;

public class Barrera extends Obstaculo{
	
	protected int vida;
	
	public Barrera(){
		vida=100;
		grafico = new BarreraGrafico();
		vida = 500;
	}

	@Override
	public void afectar(Enemigo e) {
		e.setState(new AtacandoEnemigo(e,this));
		
	}

	@Override
	public void afectar(Torre t) {
		t.setState(new AtacandoTorre(t));
		
	}

	@Override
	public float getInicioRangoX() {
		return x;
	}

	@Override
	public float getFinRangoX() {
		return x+50;
	}
	
	public void disminuirVida(int n) {
		vida-=n;
	}
}
