package tictactoe;

public class TicTacToeUC1 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();
        printBoard();
    }

    // Initialize board with '-'
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print board in simple format
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
    }
}