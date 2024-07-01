import java.util.Scanner;
public class TwoDimensionalArray {
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args){

        int[][] numbers= getArray();
        int sum= sum(numbers);
        System.out.println("Sum of the set is "+ sum);
    }
    public static int[][] getArray(){
        int[][] aman =new int[3][3];
        System.out.println("Enter "+ aman.length+" rows and "+ aman[0].length+ " columns");
        for(int i =0;i< aman.length;i++){
            for(int j=0;j<aman[i].length;j++){
                aman[i][j]=input.nextInt();
            }
        }
        return aman;
    }
    public static int sum(int[][] numbers){
        int totalSum=0;
        for(int i=0;i< numbers.length;i++){
            for(int j =0;j< numbers[i].length;j++){
                totalSum+=numbers[i][j];
            }
        }
        return totalSum;
    }

}
