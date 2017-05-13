package figures;

public class BlackKing extends Figure {

	public BlackKing() {
		super("Black King", "src/figures/blackKing.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move(int x, int y, Figure[][] board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkJumps() {
		// TODO Auto-generated method stub
		return false;
	}

}
