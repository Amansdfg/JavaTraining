import java.util.Scanner;

public class Increment {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() % 10);
        System.out.println("What is "+number1+" + " + number2+ " = ");
        int answer = input.nextInt();
        System.out.println(number1+" + "+number2+" = "+ " is "+(number1+number2==answer));
    }
}
