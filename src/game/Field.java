package game;

import java.awt.Color;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Field extends JButton {

	private BufferedImage icon;
	public Field(){
		this.setBackground(Color.RED);
		//this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setContentAreaFilled(true);
		this.setMargin(new Insets(0, 0, 0, 0));
		
	}	
	public void setFieldIcon(BufferedImage image){
		this.setIcon(new ImageIcon(image));
	}
}
