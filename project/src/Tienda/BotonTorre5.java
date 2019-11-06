package Tienda;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import Personajes.Torre5;

public class BotonTorre5 extends BotonTorre{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BotonTorre5(Tienda t){
		super(t);
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre5.gif")));
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.comprarTorre(new Torre5());
			}
			
		});
	}
}
