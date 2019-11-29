package Tienda;



import javax.swing.ImageIcon;


import Personajes.Torre5;

@SuppressWarnings("serial")
public class BotonTorre5 extends BotonTorre{

	public BotonTorre5(Tienda t){
		super(t);
		precio.setText(new Torre5().getPrecio()+"");
	}

	@Override
	public void comprar() {
		tienda.comprarTorre(new Torre5());
	}

	@Override
	public void colocarIconoTorre() {
		this.setIcon(new ImageIcon(getClass().getResource("/Sprites/torre5.gif")));
	}
}
