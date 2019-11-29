package Tienda;

import javax.swing.ImageIcon;


import Personajes.Torre4;

@SuppressWarnings("serial")
public class BotonTorre4 extends BotonTorre{

	public BotonTorre4(Tienda t){
		super(t);
		precio.setText(new Torre4().getPrecio()+"");
	}

	@Override
	public void comprar() {
		tienda.comprarTorre(new Torre4());
	}

	@Override
	public void colocarIconoTorre() {
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre4.png")));
	}
	
	
}
