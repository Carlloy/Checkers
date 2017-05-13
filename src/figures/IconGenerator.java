package figures;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class IconGenerator {
	private static final String path = "src/figures/";
	
	public static BufferedImage blackKing(){
		return getIcon("blackKing");
	}
	public static BufferedImage whiteKing(){
		return getIcon("whiteKing");
	}
	public static BufferedImage blackMan(){
		return getIcon("blackMan");
	}
	public static BufferedImage whiteMan(){
		return getIcon("whiteMan");
	}
	public static BufferedImage greenWhiteKing(){
		return getIcon("greenWhiteKing");
	}
	public static BufferedImage greenBlackKing(){
		return getIcon("greenBlackKing");
	}
	public static BufferedImage green(){
		return getIcon("green");
	}
	public static BufferedImage brown(){
		return getIcon("brown");
	}
	public static BufferedImage white(){
		return getIcon("white");
	}
	
	private static BufferedImage getIcon(String iconName){
		try {
			BufferedImage icon =  ImageIO.read(new File(path+iconName+".png"));
			return icon;
		} catch (IOException e) {
			return null;
		}
	}
}
