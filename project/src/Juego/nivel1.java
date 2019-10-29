package Juego;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

public class nivel1 extends Nivel{
	
	
	
	public nivel1(Mapa mapa) {
		 try {
			 frecuencia=500;
			 cantEnemigos=0;
			 this.mapa = mapa;
			 lista = new LinkedList<Enemigo>();
			 Properties prop=new Properties();
			 FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\Niveles\\nivel1.properties");
			 prop.load(ip);		 
				 
			 Set<String> keys = prop.stringPropertyNames();
			 for (String key : keys){
				 int fila =  Integer.parseInt(key)%6;;
				 cantEnemigos++;
				 switch(prop.getProperty(key)){
				 
					 case "enemigo1":
						 lista.add(new Enemigo1(1100,96*fila,mapa));
						 break;
					 case "enemigo2":
						 lista.add(new Enemigo2(1100,96*fila,mapa));
						 break;
					 case "enemigo3":
						 lista.add(new Enemigo3(1100,96*fila,mapa));
						 break;
					 case "enemigo4":
						 lista.add(new Enemigo4(1100,96*fila,mapa));
						 break;
					 case "enemigo5":
						 lista.add(new Enemigo5(1100,96*fila,mapa));
						 break;
				}

			 }

	    } catch (IOException ex) {
	    	ex.printStackTrace();
	    }

	}
	
	public List<Enemigo> getOleada(){
		return lista;
	}
	
	public int cantEnemigos() {
		return cantEnemigos;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
}