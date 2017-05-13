package figures;

public abstract class Figure {
	public final String name;
	public final String imagePath;
	public Figure(String name, String imagePath){
		this.name=name;
		this.imagePath=imagePath;
	}
	public abstract boolean move(int x, int y, Figure[][] board);
	public String getName(){
		return name;
	};
	public String getImage(){
		return imagePath;
	};
	public abstract boolean checkJumps();
	
	}
