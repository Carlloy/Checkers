package figures;

public class WhiteMan extends Figure {

	public WhiteMan() {
		super("White man", "src/figures/whiteMan.png");
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
