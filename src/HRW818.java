import java.util.Scanner;
public class HRW818 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int[][] numbers=new int[6][6];
        for(int i =0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }
        int[][] aman=new int[4][4];
        for(int i =0;i<aman.length;i++){
            int counter=0;
            for(int j =0;j<aman[i].length;j++) {
                counter = numbers[i][j] + numbers[i][j + 1] + numbers[i][j + 2] +
                        numbers[i + 1][j] + numbers[i + 1][j + 1] + numbers[i + 1][j + 2] +
                        numbers[i + 2][j] + numbers[i + 2][j + 1] + numbers[i + 2][j + 2];
                aman[i][j] = counter;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i =0;i<aman.length;i++){
            for(int j =0;j<aman[i].length;j++){
                if(aman[i][j]>max){
                    max=aman[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
