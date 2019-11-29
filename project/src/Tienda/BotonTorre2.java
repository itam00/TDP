package Tienda;

import javax.swing.ImageIcon;
import Personajes.Torre2;

@SuppressWarnings("serial")
public class BotonTorre2 extends BotonTorre{

	public BotonTorre2(Tienda t){
		super(t);
		precio.setText(new Torre2().getPrecio()+"");
	}

	@Override
	public void comprar() {
		tienda.comprarTorre(new Torre2());
	}

	@Override
	public void colocarIconoTorre() {
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre2.gif")));
	}


}