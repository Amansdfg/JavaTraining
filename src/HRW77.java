import java.util.Scanner;
public class HRW77 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        int[] numbers = new int[number];
        for(int i =0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        int counter = 0;
        for(int i =0;i<numbers.length -1;i++){
            if(numbers[i]!=numbers[i+1]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}