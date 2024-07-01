import java.util.Scanner;
public class HRW8last {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] numbers=new int[row][column];
        for(int i=0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }
        boolean[][] aman1=new boolean[row][column];
        for(int i =0;i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                int number=numbers[i][j];
                for(int a=0;a<numbers.length;a++){
                    for(int b=0;b<numbers[a].length;b++){
                        if(a!=i || b!=j &&  number==numbers[a][b]){
                            aman1[a][b]=true;
                        }
                    }
                }
            }
        }
        for(int i=0;i<aman1.length;i++){
            for(int j =0;j<aman1[i].length;j++){
                if(!aman1[i][j]){
                    System.out.print(numbers[i][j]+" ");
                }

            }
        }
    }
}
