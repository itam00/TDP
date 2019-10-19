package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Personajes.Torre1;
import Recolectable.Congelador;

public class ManejadorCongelacion extends ManejadorPowerUp {
	
	public ManejadorCongelacion(Tienda t) {
		super(t);
		usar.setIcon(new ImageIcon(getClass().getResource("/Sprites/congelacionIcono.png")));
	}

	@Override
	public void comprar() {
		tienda.comprar(new Congelador(), this);
	}

	@Override
	public void usarPowerUp() {
		cant--;
	}
}
