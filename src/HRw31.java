import java.util.Scanner;
public class HRw31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int length = (int) (Math.log10(number)+1);
        if (length == 1) {
            if (number % 2 == 0) {
                System.out.println("2");
            } else if (number % 3 == 0) {
                System.out.println("3");
            } else if (number % 5 == 0) {
                System.out.println("5");
            }

        } else if (length == 2) {
            int number1 = number / 10;
            int number2 = number % 10;
            if (number1 % 2 == 0 && number2 % 3 == 0) {
                System.out.println("2 5");

            } else if (number1 % 2 == 0 && number2 % 5 == 0) {
                System.out.println("2 5");

            } else if (number1 % 3 == 0 && number2 % 5 == 0) {
                System.out.println("3 5");



            }
        } else if (length == 3) {
            int number1 = number / 100;
            int number2 = number / 10;
            int number3 = number % 10;
            if (number1 % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println("2 3 5");
            }
        }
    }
}
