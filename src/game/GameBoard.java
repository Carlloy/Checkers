package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import figures.*;

public class GameBoard extends JPanel {
	Figure[][] board = new Figure[8][8];

	public GameBoard() {
		configure();
	}

	public void resetMap() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = null;
			}
		}
		setBlack();
		setWhite();
	}

	private void setBlack() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0 && j % 2 != 0) {
					board[i][j] = new BlackMan();
				} else if (i % 2 != 0 && j % 2 == 0) {
					board[i][j] = new BlackMan();
				}
			}
		}
	}

	private void setWhite() {
		for (int i = 5; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0 && j % 2 != 0) {
					board[i][j] = new WhiteMan();
				} else if (i % 2 != 0 && j % 2 == 0) {
					board[i][j] = new WhiteMan();
				}
			}
		}
	}

	private void configure() {
		GridLayout layout = new GridLayout(8, 8);
		this.setLayout(layout);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Field button = new Field();
			
				if (i % 2 == 0 && j % 2 != 0) {
					button.setFieldIcon(IconGenerator.brown());
				} else if (i % 2 != 0 && j % 2 == 0) {
					button.setFieldIcon(IconGenerator.brown());
				} else {
					button.setFieldIcon(IconGenerator.white());
					button.setEnabled(false);
				}
				button.setBackground(Color.BLACK);
				this.add(button);
			}
		}
		this.setBackground(Color.white);
	}
}
