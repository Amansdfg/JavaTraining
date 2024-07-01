import java.util.Scanner;
public class GreatestCommonDivisor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        int gcd = 1;
        int possibleDivisor = 2;
        while(possibleDivisor<=firstNumber && possibleDivisor<=secondNumber){
            if(firstNumber % possibleDivisor==0 && secondNumber % possibleDivisor ==0){
                gcd = possibleDivisor;
            }possibleDivisor++;
        }
        System.out.println("The greatest common divisor of" + firstNumber +" and " + secondNumber + " is" + gcd);
    }
}
