package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class BotonTorre extends JButton{
	protected Tienda tienda;
	public BotonTorre(Tienda t) {
		tienda = t;
		this.setOpaque(true);
	}
	
}
