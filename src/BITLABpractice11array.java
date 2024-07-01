import java.util.Scanner;
public class BITLABpractice11array{
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        int row = input.nextInt();
        int column =input.nextInt();
        int[][] numbers=new int[row][column];
        for(int i =0;i< numbers.length;i++){
            for(int j =0;j< numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }
        int sum;
        for(int i=0;i< numbers.length;i++){
            sum=0;
            for(int j =0;j<numbers[i].length;j++){
                sum+=numbers[i][j];
            }
            System.out.println(sum);
        }
    }
}
