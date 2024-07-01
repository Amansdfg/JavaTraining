import java.util.Scanner;

public class HRw31GPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0) {
            if (number % 3 == 0) {
                if (number % 5 == 0) {
                    System.out.println("235");
                } else {
                    System.out.println("23");
                }
            } else if (number % 5 == 0) {
                System.out.println("25");
            } else {
                System.out.println("2");
            }
        } else if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println("35");
            } else {
                System.out.println("3");
            }
        } else if (number % 5 == 0) {
            System.out.println("5");
        } else {
            System.out.println("MAYBE PRIME");
        }
    }
}


