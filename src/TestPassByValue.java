import java.util.Scanner;
public class TestPassByValue {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("Before in invoking the swap method, the first  number is "+ number1 + " and the second number " + number2);
        swap(number1, number2);

    }
    public static void swap(int num1 ,int  num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
