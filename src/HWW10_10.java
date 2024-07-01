import java.util.Arrays;
import java.util.Scanner;
public class HWW10_10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for(int i =0;i<numbers.length;i++){
            numbers[i]= input.nextInt();
        }
        System.out.println(aman(numbers));
    }public static int aman(int[] numbers){
        Arrays.sort(numbers);
        for(int i= numbers.length-1;i>1;i--){
            if(numbers[i]<numbers[i-1]+numbers[i-2]){
                return numbers[i]+ numbers[i-2]+numbers[i-1];
            }
        }
        return 0;
    }
}