package Objetos;

import Graficos.BarreraGrafico;  
import Personajes.Enemigo;
import Personajes.Torre;
import State.AtacandoEnemigo;
import State.AtacandoTorre;

public class Barrera extends Obstaculo{
	
	public Barrera(){
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

}
