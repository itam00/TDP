package Graficos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.* ;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public abstract class ElementoGrafico extends JLabel{

	protected int width, height;
	protected boolean muerto;
	protected String porDefecto;
	
	protected int cantFrames,actual,frecActualizacion;
	protected ImageReader reader;
	protected long ultimaActualizacion;
	
	public ElementoGrafico() {
		ultimaActualizacion = 0;
		frecActualizacion = 100;
		actual = 0;
		muerto=false;
		//this.setOpaque(true);
	}
	
	public boolean terminoAnimacion() {
		return actual == cantFrames-1;
	}
	
	public boolean estaMuerto() {
		return muerto;
	}
	
	public int getAncho() {
		return width;
	}
	public int getAlto() {
		return height;
	}

	public void actualizar(int x,int y) {
		try {
			this.setLocation(x, y);
			if(System.currentTimeMillis()-ultimaActualizacion>=frecActualizacion) {
				
				BufferedImage frame = reader.read(actual);
				this.setIcon(new ImageIcon(frame));
				actual= (actual+1) % (cantFrames);	
				ultimaActualizacion = System.currentTimeMillis();
			}
	
		} catch (IOException e) {
		}
	}
	
	public void setDefaultGif() {
		setGif(porDefecto);
	}
	
	protected void setGif(String dir) {
		try {
		    reader = ImageIO.getImageReadersByFormatName("gif").next();
		    File input = new File(".\\src\\Sprites\\"+dir);
		    ImageInputStream stream = ImageIO.createImageInputStream(input);
		    reader.setInput(stream);
		    cantFrames = reader.getNumImages(true);
		    //BufferedImage frame = reader.read(actual);
		   // this.setIcon(new ImageIcon(frame));
		} catch (IOException ex) {
		}
	}

}
