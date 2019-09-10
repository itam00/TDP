
	import java.awt.*;

import javax.swing.ImageIcon;
	import javax.swing.*;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	import java.awt.event.KeyEvent;

	public class GUI extends JFrame {
		private static final long serialVersionUID = 1L;

		private JPanel contentPane;
		private JLabel[][] botones;
		private JLabel dibujo;
		private JPanel panelLabels;
		
		public GUI() {
			contentPane = new JPanel();
			setContentPane(contentPane);
			panelLabels= new JPanel();
			
			getContentPane().setLayout(null);
			panelLabels.setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panelLabels.setBounds(0,0,1024,560);
			setBounds(150, 0, 1024, 768);
			
			panelLabels.setOpaque(false);
			inicializarLabels();
			agregarDibujo();

			
			this.setVisible(true);

		}
		
		public static void main(String[] args) {
						GUI frame = new GUI();
						frame.setVisible(true);
		}
		
		private void agregarDibujo(){
			ImageIcon imagen = new ImageIcon(this.getClass().getResource("sprites\\suelo2.png"));
			dibujo = new JLabel(imagen);
			dibujo.setOpaque(false);
			contentPane.add(dibujo);
			dibujo.setBounds(0, 0,1024,580);
		}
		
		private void inicializarLabels() {
			botones= new JLabel[6][10];
			for (int i=0; i<botones.length;i++)
				for (int j=0; j<botones[0].length;j++) {
					botones[i][j]=new JLabel();
					botones[i][j].setIcon(new ImageIcon(this.getClass().getResource("sprites\\torre4.png")));
					botones[i][j].setOpaque(false);
					botones[i][j].setSize(62, 62);
					panelLabels.add(botones[i][j]);
					//contentPane.add(botones[i][j]);
					botones[i][j].setLocation(i*(1024/6), j*(580/6));
				}
			contentPane.add(panelLabels);
					
		}
}
//setbound
	//setlocation