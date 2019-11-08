package Tienda;

import javax.swing.JButton;

@SuppressWarnings("serial")
public abstract class BotonTorre extends JButton{
	protected Tienda tienda;
	public BotonTorre(Tienda t) {
		tienda = t;
		this.setOpaque(true);
	}
	
}
