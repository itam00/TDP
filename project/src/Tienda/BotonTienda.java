package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class BotonTienda extends JButton{
	protected Tienda tienda;
	public BotonTienda(Tienda t) {
		tienda = t;
		this.setOpaque(true);
	}
	
}
