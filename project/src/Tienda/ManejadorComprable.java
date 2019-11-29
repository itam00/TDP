package Tienda;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Juego.Mapa;
import Recolectable.Recolectable;

public abstract class ManejadorComprable {
	protected Tienda tienda;
	protected JButton comprar,usar;
	protected JLabel cantidad,precio;
	protected int cant,tiempoEspera;
	protected long ultimoUsado;
	
	public ManejadorComprable (Tienda t) {
		this.tienda = t;
		
		cant = 0;
		comprar = new JButton();
		usar = new JButton();
		cantidad= new JLabel(""+cant);
		precio = new JLabel(" asdf");
		comprar.setIcon(new ImageIcon(getClass().getResource("/Sprites/agregarIcono.gif")));
		ultimoUsado = 0;
		Font fuente = new Font("Calibri", 2, 16);
		precio.setFont(fuente);
		precio.setForeground(Color.black);
        cantidad.setFont(fuente);
        cantidad.setForeground(Color.black);
		usar.setHorizontalTextPosition( SwingConstants.CENTER );
		usar.setVerticalTextPosition( SwingConstants.CENTER );
		
		comprar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comprar();
			}
			
		});
		
		comprar.addMouseListener(new MouseAdapter() {
		    public void mouseEntered(MouseEvent evt) {
		    	precio.setVisible(true);	
		    }

		    public void mouseExited(MouseEvent evt) {
		    	precio.setVisible(false);
		    }
		});
		
		comprar.add(precio);
	}
	
	protected abstract void comprar();
	
	protected abstract void bloquear();
	
	
	public abstract Recolectable getRecolectable(int x, int y, Mapa m);
	
	public void actualizar() {
		
		if(!usar.isEnabled()) {
			int tiempoRestante = (int)((System.currentTimeMillis()-ultimoUsado)/1000);
			usar.setText(""+ (tiempoEspera-tiempoRestante));
			if(System.currentTimeMillis() - ultimoUsado >tiempoEspera) {
				usar.setEnabled(true);
				usar.setText("");
			}
		}
		cantidad.setText(""+cant);
	}
	
	public void colocarEnTienda(int x, int y) {
		tienda.add(usar);
		tienda.add(comprar);
		tienda.add(cantidad);
		usar.setBounds(x,y,31,31);
		comprar.setBounds(x+31,y,31,31);
		cantidad.setBounds(x+65, y, 60, 30);
	}
	
	public void reiniciar() {
		cant=0;
	}
}
