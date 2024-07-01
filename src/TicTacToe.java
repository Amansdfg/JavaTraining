import java.util.Scanner;

public class TicTacToe{
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        displayBoard(board);

        char currentPlayer = 'X';
        boolean gameOver = false;

        while (!gameOver) {
            int row, col;
            boolean validMove = false;
            Scanner input = new Scanner(System.in);

            do {
                System.out.print("Enter a row (0, 1, or 2) for player " + currentPlayer + ": ");
                row = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player " + currentPlayer + ": ");
                col = input.nextInt();
                if (isValidMove(board, row, col)) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!validMove);

            board[row][col] = currentPlayer;
            displayBoard(board);

            if (checkWin(board, currentPlayer)) {
                System.out.println(currentPlayer + " player won!");
                gameOver = true;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw. No winner.");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Row win
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Column win
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Diagonal win
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Diagonal win
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false; // Board is not full
                }
            }
        }
        return true; // Board is full
    }
}
