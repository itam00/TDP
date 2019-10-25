package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Juego.Mapa;
import Recolectable.PowerUp;

public abstract class ManejadorPowerUp {
	protected Tienda tienda;
	protected JButton comprar,usar;
	protected int cant;
	
	public ManejadorPowerUp(Tienda t) {
		this.tienda = t;
		cant = 0;
		comprar = new JButton();
		usar = new JButton();
		comprar.setIcon(new ImageIcon(getClass().getResource("/Sprites/agregarIcono.gif")));
		
		usar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usarPowerUp();
			}
		});
		comprar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comprar();
			}
			
		});
	}
	public void agregarPowerUp() {
		cant++;
	}
	

	
	public void colocarEnTienda(int x, int y) {
		tienda.add(usar);
		tienda.add(comprar);
		
		usar.setBounds(x,y,31,31);
		comprar.setBounds(x+31,y,31,31);
	}
	
	public abstract void comprar();
	
	public abstract void usarPowerUp();

	public abstract PowerUp getPowerUp(int x, int y, Mapa m);
	
	public void recogido() {
		System.out.println("contador de congeladores aumenta en 1");
		cant++;
	}
}
