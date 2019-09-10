
	import java.awt.EventQueue;
	import java.awt.Rectangle;

	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	import java.awt.event.KeyEvent;

	public class GUI extends JFrame {
		private static final long serialVersionUID = 1L;

		private JPanel contentPane;
		
		private JLabel dibujo;
		public GUI() {

			getContentPane().setLayout(null);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(150, 0, 1024, 768);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			this.agregarDibujo();
		}
		
		public static void main(String[] args) {
						GUI frame = new GUI();
						frame.setVisible(true);
		}
		
		private void agregarDibujo(){
			ImageIcon imagen = new ImageIcon(this.getClass().getResource("sprites\\sueloMapa.png"));
			dibujo = new JLabel(imagen);
			
			dibujo.setBounds(0, 0, 1024, 768);
			
			this.add(dibujo);
		}
}
