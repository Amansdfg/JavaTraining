import java.util.Scanner;
public class HRW83 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int row = input.nextInt();
        int column =input.nextInt();
        int[][] numbers=new int[row][column];
        for(int i=0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }
        int[][] reverse = new int[row][column];
        for(int i=0,a=numbers.length-1;i<numbers.length;i++,a--){
            for(int j =0, b= numbers[i].length-1;j<numbers[i].length;j++,b--){
                reverse[i][b] =numbers[j][a];
            }
        }
        for(int i =0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                System.out.print(reverse[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
