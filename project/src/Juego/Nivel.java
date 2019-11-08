package Juego;

import java.util.LinkedList;
import java.util.List;

import Entidad.Lago;
import Entidad.ObjetoMapa;
import Entidad.Piedra;
import Personajes.Enemigo;
import State.ProtegidoEnemigo;


public abstract class Nivel {
	protected final int finMapa = 1028;
	protected int frecuencia;
	protected List<List<Enemigo>> oleadasNivel;
	protected Mapa mapa;
	protected int cantEnemigos,cantOleadas,probabilidadEscudo;
	
	public Nivel(Mapa mapa) {
		this.mapa = mapa;
	}
	
	public List<List<Enemigo>> getEnemigos(){
		return oleadasNivel;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	
	protected void generarOleadas() {
		List<Enemigo> oleada;
		oleadasNivel = new LinkedList<List<Enemigo>>();
		for(int i=0;i<cantOleadas;i++) {
			oleada = new LinkedList<Enemigo>();
			while(oleada.size()<cantEnemigos) {
				oleada.add(generarEnemigo());
			}
			oleadasNivel.add(oleada);
		}
	}
	
	protected abstract Enemigo generarEnemigo();
	
	public int filaRandom() {
		return (int)(Math.random()*6)*96;
	}
	public void agregarEscudo(Enemigo enemigo) {
		int prob = (int)(Math.random()*101);
		if(prob>probabilidadEscudo) {
			enemigo.setState(new ProtegidoEnemigo(enemigo));
		}
	}
	
	public ObjetoMapa generarObjetoMapa(int x, int y, Mapa m){
		ObjetoMapa toreturn;
		int tipoObjeto= (int)(Math.random()*2)+1;
		if (tipoObjeto==1) {
			toreturn= new Lago(x,y,m);
			System.out.println("cree un lago");
		}
		else {
			toreturn= new Piedra(x,y,m);
			System.out.println("cree una piedra");
		}
		return toreturn;
	}



}
