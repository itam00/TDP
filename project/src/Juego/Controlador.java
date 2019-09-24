package Juego;
import java.util.*; 

import GUI.*;
import Personajes.*;
import Entidad.*;

public class Controlador {
	protected GUI gui;
	protected List<Elemento> entidades;
	protected ContadorTiempo contador;
	
	public Controlador(GUI g) {
		gui = g;
		entidades = new ArrayList<Elemento>();
	}
	
	public void actualizar() {
		List<Elemento> toRemove= new ArrayList<Elemento>();
		for (Elemento e:entidades) {
			e.actualizar();
			if( e.estaMuerto())
				toRemove.add(e);
		}
		for (Elemento e:toRemove) {
			entidades.remove(e);
			gui.remover(e.obtenerGrafico());
		}
	}
	
	public void comprarTorre(int x,int y) {
		boolean lugarLibre=true;
		Iterator<Elemento> it = entidades.iterator();
		Elemento aux;
		System.out.println("x:" +x+" y: "+y);
		/*while(it.hasNext() && lugarLibre) {
			aux = it.next();
			//lugarLibre = !coincidePosicion(aux,x,y);
		}
		*/
		if(lugarLibre) {
		//	Torre nueva = new Isaac(x,y);
			Disparo nueva= new DisparoAliado(x,y);
			entidades.add(nueva);
			System.out.println("comprado");
			gui.añadir(nueva.obtenerGrafico());
		}
	}
	
//	public void remover() {
//		for(Disparo s: entidades) {
//			s.obtenerGrafico().cambiar();
//		}
		//también que borrarlo del controlador.
//	}
	
	//cada objeto gráfico tiene que conocer a su objeto lógico.
}
