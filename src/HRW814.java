import java.util.Scanner;
public class HRW814 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row= input.nextInt();
        int column =input.nextInt();
        int[][] numbers=new int[row][column];
        for(int i=0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                numbers[i][j]= input.nextInt();
            }
        }
        for(int i =0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j] +((numbers[i].length-1>j)?",":" "));
            }
            System.out.println();
        }
    }
}
