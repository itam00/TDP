package Juego;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import Personajes.Enemigo;
import Personajes.Enemigo1;
import Personajes.Enemigo2;
import Personajes.Enemigo3;
import Personajes.Enemigo4;
import Personajes.Enemigo5;

public abstract class Nivel {
	protected int frecuencia;
	protected List<List<Enemigo>> enemigos;
	protected Mapa mapa;
	
	public List<List<Enemigo>> getEnemigos(){
		return enemigos;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	
	protected synchronized void agregarEnemigosAListas(String dir) {
		try {
			Properties prop=new Properties();
			 FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+dir);
			 prop.load(ip);		 
				 
			 Set<String> keys = prop.stringPropertyNames();
			 List<Enemigo> oleada = new LinkedList<Enemigo>();
			 
			 for (String key : keys){
				 int fila =  Integer.parseInt(key)%6;
				 System.out.println(prop.getProperty(key));
				 
				 switch(prop.getProperty(key)){
				 
					 case "enemigo1":
						 oleada.add(new Enemigo1(1100,96*fila,mapa));
						 break;
					 case "enemigo2":
						 oleada.add(new Enemigo2(1100,96*fila,mapa));
						 break;
					 case "enemigo3":
						 oleada.add(new Enemigo3(1100,96*fila,mapa));
						 break;
					 case "enemigo4":
						 oleada.add(new Enemigo4(1100,96*fila,mapa));
						 break;
					 case "enemigo5":
						 oleada.add(new Enemigo5(1100,96*fila,mapa));
						 break;
					 case "fin oleada":
						 enemigos.add(oleada);
						 System.out.println(oleada.size());
						 oleada = new LinkedList<Enemigo>();
						 break;	 
				}
	
			 }
	
	   } catch (IOException ex) {
	   	ex.printStackTrace();
	   }
	}
}
