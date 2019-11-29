package Tienda;

import javax.swing.ImageIcon;
import Personajes.Torre1;

@SuppressWarnings("serial")
public class BotonTorre1 extends BotonTorre{


	public BotonTorre1(Tienda t){
		super(t);
		precio.setText(new Torre1().getPrecio()+"");
	}

	@Override
	public void comprar() {
		tienda.comprarTorre(new Torre1());
	}

	@Override
	public void colocarIconoTorre() {
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/isaac.gif")));
	}

	
}
