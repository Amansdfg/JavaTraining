import java.util.Currency;
import java.util.Scanner;
public class TicTacToeMyOwn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This game is TicTacToe game");
        char[][] board = new char[3][3];
        initializeBoard(board);
        displayBoard(board);
        char currentPlayer = 'X';
        int row ,column;
        boolean gameOver = false;
        while (!gameOver) {
            boolean isValid = false;
            do {
                System.out.print("Enter a row(0, 1 or 2) for player " + currentPlayer + ": ");
                row = input.nextInt();
                while (true) {
                    if (row == 0 || row == 1 || row == 2) {
                        break;
                    } else {
                        System.out.print("Enter a row(0, 1 or 2) for player " + currentPlayer + ": ");
                        row = input.nextInt();
                    }
                }
                System.out.print("Enter a column(0, 1 or 2) for player " + currentPlayer + ":");
                column = input.nextInt();
                while (true) {
                    if (column == 1 || column == 2 || column == 0) {
                        break;
                    } else {
                        System.out.print("Enter a column(0, 1 or 2) for player " + currentPlayer + ":");
                        column = input.nextInt();
                    }
                }
                if (isValidMove(board,row,column)) {
                    isValid = true;
                }else {
                    System.out.println("Something going wrong please\n"+ "Please try again");
                }
            }while (!isValid);
            board[row][column]=currentPlayer;
            displayBoard(board);
            if(checkWin(board,currentPlayer)){
                System.out.println("Player"+ currentPlayer+ " wins!!!");
                gameOver=true;
            }else if(isBoardFull(board)){
                System.out.println("Its draw!!!");
                gameOver= true;
            }else{
                currentPlayer= ((currentPlayer=='X')? 'O' : 'X');
            }
        }
    }
    public static void displayBoard ( char[][] board){
        System.out.println("--------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]  + " | ");
            }
            System.out.println("\n--------------");
        }
    }
    public static void initializeBoard ( char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public static boolean isValidMove(char[][] board , int row , int column){
        return (board[row][column]==' ');
    }
    public static boolean checkWin(char[][]  board,int currentPlayer){
        for(int i =0;i<board.length;i++){
            if(board[i][0]==currentPlayer&& board[i][1]==currentPlayer && board[i][2]==currentPlayer){
                return true;
            }else if(board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer){
                return true;
            }
        }
        if(board[1][1]==currentPlayer&& board[2][2]==currentPlayer && board[0][0]==currentPlayer){
            return true;
        }
        if(board[0][2]==currentPlayer && board[1][1]==currentPlayer && board[2][0]== currentPlayer){
            return true;
        }
        return  false;
    }
    public static boolean isBoardFull(char[][] board){
        for(int i =0;i<board.length;i++){
            for(int j= 0;j<board[i].length;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}
