
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
		private JButton[][] botones;
		private JLabel dibujo;
		private JPanel panelBotones;
		private JPanel panelMovimiento;
		private int i;
		private static Controlador controlador;
		
		public GUI() {
			i=0;
			controlador = new Controlador(this);
			
			contentPane = new JPanel();
			setContentPane(contentPane);
			panelBotones= new JPanel();
			panelMovimiento= new JPanel();
			this.setResizable(false);
			
			getContentPane().setLayout(null);
			panelBotones.setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panelBotones.setBounds(0,0,1024,580);
			setBounds(150, 0, 1028, 768);//esto quedo asi porque con 1024 no se ve el borde

			
			panelBotones.setOpaque(false);
			inicializarLabels();
			agregarDibujo();

			
			this.setVisible(true);
			this.setResizable(false);
		}
		
		public static void main(String[] args) {
						GUI frame = new GUI();
						frame.setVisible(true);
						
						controlador= new Controlador(frame);
						ContadorTiempo c= new ContadorTiempo(controlador);
						c.run();
		}
		
		private void agregarDibujo(){
			ImageIcon imagen = new ImageIcon(this.getClass().getResource("sprites\\sueloMapa.png"));
			dibujo = new JLabel(imagen);
			dibujo.setOpaque(false);
			contentPane.add(dibujo);
			dibujo.setBounds(0, 0,1024,575);
		}
		
		private void inicializarLabels() {
			botones= new JButton[6][10];
			for (int i=0; i<botones.length;i++)
				for (int j=0; j<botones[0].length;j++) {
					botones[i][j]=new JButton();
					botones[i][j].setIcon(new ImageIcon(this.getClass().getResource("sprites\\isaac.gif")));
					botones[i][j].setOpaque(false);
					botones[i][j].setContentAreaFilled(false);
					botones[i][j].setSize(103, 97);
					panelBotones.add(botones[i][j]);
					botones[i][j].setLocation(j*(1024/10), i*(580/6));
				}
			
			for(int i=0;i<botones.length;i++) {
				botones[i][8].setIcon(new ImageIcon(this.getClass().getResource("sprites\\proyectil.png")));
				botones[i][9].setIcon(new ImageIcon(this.getClass().getResource("sprites\\proyectilImpacto.gif")));
			}
			contentPane.add(panelBotones);
				
		}
		
		public void avanzar() {
			i++;
		}
		
}
//setbound
	//setlocation