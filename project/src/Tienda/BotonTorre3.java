package Tienda;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Personajes.Torre3;

@SuppressWarnings("serial")
public class BotonTorre3 extends BotonTorre{
	public BotonTorre3(Tienda t){
		super(t);
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre3.gif")));
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprarTorre(new Torre3());
			}
			
		});
	}
}
