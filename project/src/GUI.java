
	import java.awt.EventQueue;
	import java.awt.*;
	import java.awt.Rectangle;

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
		private JPanel panelBotones;
		private JLabel dibujo;
		public GUI() {

			getContentPane().setLayout(null);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(150, 0, 1024, 768);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
		    //contentPane.setLayout();
			
			panelBotones= new JPanel();
			panelBotones.setOpaque(false);
			panelBotones.setLayout(new GridLayout(6,10));
			
			agregarDibujo();
			inicializarBotones();
			panelBotones.setBackground(Color.BLACK);
			this.setVisible(true);
			contentPane.add(panelBotones);
			setContentPane(contentPane);
		}
		
		public static void main(String[] args) {
						GUI frame = new GUI();
						frame.setVisible(true);
		}
		
		private void agregarDibujo(){
			ImageIcon imagen = new ImageIcon(this.getClass().getResource("fondo.png"));
			dibujo = new JLabel(imagen);
			dibujo.setOpaque(false);
			dibujo.setBounds(0, 0, 1024, 768);
			
			contentPane.add(dibujo);
		}
		
		private void inicializarBotones() {
			botones= new JButton[6][10];
			for (int i=0; i<botones.length;i++)
				for (int j=0; j<botones.length;j++) {
					botones[i][j]=new JButton();
					botones[i][j].setSize(1024/10,768/6);
					botones[i][j].setOpaque(false);
					botones[i][j].setContentAreaFilled(false);
					panelBotones.add(botones[i][j]);
				}
					
		}
}
