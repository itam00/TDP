package Tienda;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Juego.Mapa;
import PowerUps.PowerUp;
import Recolectable.Recolectable;

public abstract class ManejadorPowerUp {
	protected Tienda tienda;
	protected JButton comprar,usar;
	protected int cant,tiempoEspera;
	protected boolean bloqueado;
	protected long ultimoUsado;
	
	public ManejadorPowerUp(Tienda t) {
		this.tienda = t;
		cant = 0;
		comprar = new JButton();
		usar = new JButton();
		comprar.setIcon(new ImageIcon(getClass().getResource("/Sprites/agregarIcono.gif")));
		bloqueado = false;
		ultimoUsado = 0;
		//Font fuente = new Font("Calibri", 2, 8);
        //usar.setFont(fuente);
		usar.setHorizontalTextPosition( SwingConstants.CENTER );
		usar.setVerticalTextPosition( SwingConstants.CENTER );

		
		usar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usarPowerUp();
			}
		});
		comprar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comprar();
			}
			
		});
	}
	public void agregarPowerUp() {
		cant++;
	}
	

	
	public void colocarEnTienda(int x, int y) {
		tienda.add(usar);
		tienda.add(comprar);
		
		usar.setBounds(x,y,31,31);
		comprar.setBounds(x+31,y,31,31);
	}
	
	public abstract void comprar();
	
	public abstract void usarPowerUp();

	public abstract Recolectable getPowerUp(int x, int y, Mapa m);
	
	public void recogido() {
		System.out.println("contador de congeladores aumenta en 1");
		cant++;
	}
	public void actualizar() {
		
		if(bloqueado) {
			int tiempoRestante = (int)((System.currentTimeMillis()-ultimoUsado)/1000);
			usar.setText(""+ (tiempoEspera-tiempoRestante));
			System.out.println(tiempoRestante);
			if(System.currentTimeMillis() - ultimoUsado >tiempoEspera) {
				bloqueado = false;
				usar.setEnabled(true);
				usar.setText("");
			}
		}
	}
	
	public void bloquear() {
		ultimoUsado = System.currentTimeMillis();
		bloqueado = true;
		usar.setEnabled(false);
	}
	
	
}
