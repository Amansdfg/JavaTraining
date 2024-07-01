import java.util.Scanner;
public class minorOrAdult {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();
        int max = number1;
        if(number2>max){
            max = number2;
        }
        if(number3>max){
            max = number3;
        }
        System.out.println("The max number is " + max);
    }
}
