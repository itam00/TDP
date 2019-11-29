package Tienda;

import javax.swing.ImageIcon;

import Personajes.Torre3;

@SuppressWarnings("serial")
public class BotonTorre3 extends BotonTorre{
	public BotonTorre3(Tienda t){
		super(t);
		precio.setText(new Torre3().getPrecio()+"");
	}

	@Override
	public void comprar() {
		tienda.comprarTorre(new Torre3());
	}

	@Override
	public void colocarIconoTorre() {
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre3.gif")));
	}

}
