package Tienda;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BotonVenta extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Tienda tienda;

	public BotonVenta (Tienda t) {
		tienda=t;
		
		this.setText("Vender");
		
		this.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				tienda.quiereVender();
			}
			
			});
		}
}
