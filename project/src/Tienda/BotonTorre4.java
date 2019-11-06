package Tienda;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Personajes.Torre4;

@SuppressWarnings("serial")
public class BotonTorre4 extends BotonTorre{

	public BotonTorre4(Tienda t){
		super(t);
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre4.png")));
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprar(new Torre4());
			}
			
		});
	}
}
