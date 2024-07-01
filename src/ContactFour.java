import java.util.Scanner;

public class ContactFour {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 7;
        char[][] board = new char[rows][cols];
        boolean isRedTurn = true;
        boolean gameWon = false;

        initializeBoard(board);
        printBoard(board);

        Scanner scanner = new Scanner(System.in);

        while (!gameWon) {
            char currentPlayer = isRedTurn ? 'R' : 'Y';
            int column;

            do {
                System.out.print("Player " + currentPlayer + ", drop a disk at column (0-" + (cols - 1) + "): ");
                column = scanner.nextInt();
            } while (!isValidMove(board, column));

            dropDisk(board, column, currentPlayer);
            printBoard(board);

            if (checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameWon = true;
            }

            isRedTurn = !isRedTurn;
        }

        scanner.close();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("  0   1   2   3   4   5   6");
    }

    public static boolean isValidMove(char[][] board, int column) {
        if (column < 0 || column >= board[0].length) {
            return false;
        }

        return board[0][column] == ' ';
    }

    public static void dropDisk(char[][] board, int column, char player) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column] == ' ') {
                board[i][column] = player;
                break;
            }
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check horizontally, vertically, and diagonally for a win
        // (You need to implement this part)
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == ' ') {
                return false;
            }
        }
        return true;
    }
}
