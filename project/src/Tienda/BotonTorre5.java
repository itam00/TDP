package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Personajes.Torre4;
import Personajes.Torre5;

public class BotonTorre5 extends BotonTorre{

	public BotonTorre5(Tienda t){
		super(t);
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre5.gif")));
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprar(new Torre5());
			}
			
		});
	}
}
