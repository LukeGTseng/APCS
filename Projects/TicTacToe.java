import java.util.*;

public class TicTacToe {
	public static void main(String[] args) {
		boolean legalMove = false;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Board Size: ");
		int size = s.nextInt(); // get size of board
		String[][] board = new String[size][size]; // Ex. 3 by 3 (Creates a square)
		for (int i = 0; i < size; i++) { // setup for blank board
			for (int j = 0; j < size; j++) {
				board[i][j] = " ";
			}
		}

		int turn = 1;
		while (checkWin(board) != true || checkTie(board, turn) != true) { // continues running if the game isn't over
			String str = "";
			createBoard(board);
			legalMove = false;
			if (checkWin(board) == true) {
				if (turn % 2 == 1) {
					System.out.println("Player 2 has won the game!");
				} else if (turn % 2 == 0) {
					System.out.println("Player 1 has won the game!");
				}
				break;
			} else if (checkTie(board, turn) == true) {
				System.out.println("The game is a Tie!");
				break;
				// If not a win nor a tie, keep playing (Depending on whose turn it is)
			} else if (turn % 2 == 1) {
				System.out.println("Player 1, your move: (e.g. 1,3)");
				str = "X";
			} else if (turn % 2 == 0) {
				System.out.println("Player 2, your move: (e.g. 1,3)");
				str = "O";
			}

			Scanner move = new Scanner(System.in);
			while (legalMove == false) {
				String input = move.next();
				int x = (Integer.parseInt(input.substring(0, input.indexOf(",")))) - 1;
				int y = (Integer.parseInt(input.substring(input.indexOf(",") + 1, input.length()))) - 1;
				if (placementErrorCheck(board, x, y) == true) {
					board[x][y] = str;
					legalMove = true;
				} else {
					System.out.println("That spot is invalid. Try again.");
				}
			}
			turn++;
		}

	}
	
	public static void createBoard(String[][] board) {
		int size = board.length;
		for (int i = 0; i < size; i++) {
			for (int a = 0; a < size; a++) {
				System.out.print("+-");
			}
			System.out.println("+");
			for (int j = 0; j < size; j++) {
				System.out.print("|" + board[i][j]);
			}
			System.out.println("|");
		}
		for (int a = 0; a < size; a++) {
			System.out.print("+-");
		}
		System.out.println("+");
	}

	public static boolean checkWin(String[][] board) { // using all the check methods to checking for win
		int size = board.length;
		// rows
		if (checkRow(board, size) == true) {
			return true;
			// columns
		} else if (checkColumn(board, size) == true) {
			return true;
			// diagonal
		} else if (checkDiag(board, size) == true) {
			return true;
			// other diagonal
		} else if (checkOtherDiag(board, size) == true) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkRow(String[][] board, int size) { // checks each row for win
		String[] list = new String[size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				list[j] = board[i][j];
			}
			if (equalCheck(list) == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkDiag(String[][] board, int size) { // checks up to down diagonal for win
		String[] list = new String[size];
		for (int i = 0; i < size; i++) {
			list[i] = board[i][i];
		}
		if (equalCheck(list) == true) {
			return true;
		}
		return false;
	}

	public static boolean checkOtherDiag(String[][] board, int size) { // checks down to up diagonal for win
		String[] list = new String[size];
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			list[i] = board[i][j];
			if (j > 0) {
				j--;
			}
		}
		if (equalCheck(list) == true) {
			return true;
		}
		return false;
	}

	public static boolean checkColumn(String[][] board, int size) { // checks each column for win
		String[] list = new String[size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				list[j] = board[j][i];
			}
			if (equalCheck(list) == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkTie(String[][] board, int turn) { // checks tie based on if every space is used using
																	// turns
		int size = board.length;
		size = size * size;
		if (size < turn && checkWin(board) == false) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean placementErrorCheck(String[][] board, int x, int y) { // invalid
		int size = board.length;
		if (x >= size || y >= size) {
			return false;
		} else if (!board[x][y].equals(" ")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean equalCheck(String[] values) {
		String checkValue = values[0];
		if (checkValue.equals(" ")) {
			return false;
		}
		for (int i = 1; i < values.length; i++) {
			if (!values[i].equals(checkValue)) {
				return false;
			}
		}
		return true;
	}
}
