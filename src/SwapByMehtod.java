import java.util.*;
public class SwapByMehtod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This is swappin numbers \nEnter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        swap(firstNumber, secondNumber);
        System.out.println("after swapping the first number " + firstNumber);
        System.out.println("after swapping the second number " + secondNumber);
    }
    public  static void swap(int number1 , int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
    }
}

