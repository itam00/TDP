package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Personajes.Torre2;

@SuppressWarnings("serial")
public class BotonTorre2 extends BotonTorre{

	public BotonTorre2(Tienda t){
		super(t);
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre2.gif")));
		this.setOpaque(true);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprarTorre(new Torre2());
			}
			
		});
	}
}