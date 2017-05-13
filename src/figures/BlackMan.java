package figures;

public class BlackMan extends Figure {

	public BlackMan() {
		super("Black Man", "src/figures/blackMan.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move(int x, int y, Figure[][] board) {
		if(board[x][y]==null){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkJumps() {
		// TODO Auto-generated method stub
		return false;
	}

}
