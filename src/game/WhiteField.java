package game;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JButton;

public class WhiteField extends Field{
	public WhiteField(){
		this.setBackground(Color.WHITE);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setContentAreaFilled(false);
		this.setMargin(new Insets(0, 0, 0, 0));
		
	}

}
