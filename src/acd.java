import java.util.Scanner;
public class acd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = {5,10,15,20};
        int counter = 0;
        for(int i = 0; i<numbers.length; i++){
            counter+=numbers[i];
        }
        System.out.println("sum = "+counter);
    }
}
