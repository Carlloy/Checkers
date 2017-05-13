package game;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	GameBoard board;

	public GameWindow() {
		this.setTitle("Checkers");
		this.setSize(8*42, 8*42);

		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board = new GameBoard();
		this.add(board);
		
		this.setVisible(true);
	}

}
