package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import Personajes.Isaac;

public class BotonTorre1 extends BotonTienda{
	public BotonTorre1(){
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/isaac.gif")));
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprar(new Isaac());
			}
			
		});
	}
}
