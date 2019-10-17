package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Personajes.Torre1;
import Personajes.Torre3;

@SuppressWarnings("serial")
public class BotonTorre3 extends BotonTienda{
	public BotonTorre3(Tienda t){
		super(t);
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre3.gif")));
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprar(new Torre3());
			}
			
		});
	}
}
