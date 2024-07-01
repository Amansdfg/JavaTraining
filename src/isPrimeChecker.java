import java.util.*;
public class isPrimeChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>0 && number<10000){
            isPrime(number);
        }
    }
    public static void isPrime(int number){
        if (number <= 1) {
            System.out.println("False");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("True");
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                System.out.println("False");
            }
        }
        System.out.println("True");
    }
}