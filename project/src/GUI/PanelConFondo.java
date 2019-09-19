package GUI;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelConFondo extends JPanel{
	public PanelConFondo() {
		this.setSize(1024,576);
	}
	
	public void paint(Graphics grafico) {
		Dimension height = getSize();
		
		ImageIcon img = new ImageIcon(getClass().getResource("/Sprites/sueloMapa.png"));
		grafico.drawImage(img.getImage(), 0, 0, height.width, height.height, null);
		setOpaque(false);
		super.paintComponent(grafico);
	}
}
