package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ManejadorPowerUp extends ManejadorComprable {
	
	public ManejadorPowerUp(Tienda t) {
		super(t);
		
		usar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usarPowerUp();
			}
		});
		
	}
	public void agregarPowerUp() {
		cant++;
	}
	
	public abstract void usarPowerUp();
	
	public void recogido() {
		System.out.println("contador de congeladores aumenta en 1");
		cant++;
	}
	
	public void bloquear() {
		ultimoUsado = System.currentTimeMillis();
		bloqueado = true;
		usar.setEnabled(false);
	}
	
	
}
