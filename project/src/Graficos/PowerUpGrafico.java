package Graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Tienda.ManejadorPowerUp;

@SuppressWarnings("serial")
public class PowerUpGrafico extends ElementoGrafico implements MouseListener {

	protected ManejadorPowerUp manejador;
	
	public PowerUpGrafico(ManejadorPowerUp m,String dir) {
		super(dir);
		addMouseListener(this);
		manejador=m;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		muerto=true;
		setVisible(false);
		manejador.recogido();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
