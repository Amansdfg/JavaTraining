import java.util.Scanner;
public class HRW85 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        int row= number;
        int[][]  numbers= new int[row][number];
        for(int i =0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < row / 2 ; i++){
            int[] temp = numbers[i];
            numbers[i]=numbers[row-1-i];
            numbers[row-1-i] = temp;
        }
        for(int i =0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
