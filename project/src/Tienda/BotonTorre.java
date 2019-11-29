package Tienda;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public abstract class BotonTorre extends JButton{
	protected Tienda tienda;
	protected JLabel precio;
	protected Icon icono;
	
	public BotonTorre(Tienda t) {
		tienda = t;
		this.setOpaque(true);
		colocarIconoTorre();

		precio = new JLabel();
		precio.setFont(new Font("Arial",3,32));
		precio.setForeground(Color.yellow);
		precio.setBorder(new TitledBorder(new EtchedBorder(), "Precio"));
		precio.setVisible(false);
		this.add(precio);
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comprar();
			}
			
		});
		
		this.addMouseListener(new MouseAdapter() {
		    public void mouseEntered(MouseEvent evt) {
		    	mostrarPrecio();	
		    }

		    public void mouseExited(MouseEvent evt) {
		    	colocarIconoTorre();
		    	precio.setVisible(false);
		    }
		});
	}
	
	public abstract void colocarIconoTorre();
	
	public abstract void comprar();
	
	public void mostrarPrecio() {
		precio.setVisible(true);
	}
	

}
