import java.util.Scanner;
public class Kalabay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ends if you enter 0");
        int number =input.nextInt();
        int sum = 0;
        while(number !=0){
            sum+=number;
            System.out.println("Enter a number ends if you enter 0");
            number= input.nextInt();
        }
        System.out.println("Sum is "+ sum );
    }
}
