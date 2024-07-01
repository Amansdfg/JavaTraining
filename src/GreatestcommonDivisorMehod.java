//import java.util.Scanner;
//public class GreatestcommonDivisorMehod {
//    public static void main(String[] args){
//        Scanner input = new Scanner (System.in);
//        System.out.println("This is the Greatest  common Divisor ");
//        System.out.println("Enter the first number: ");
//        int number1 = input.nextInt();
//        System.out.println("Enter the second number: ");
//        int number2 = input.nextInt();
//        int divisor1 = divisor(number1,number2);
//        System.out.println("The greatest common divisor "+ divisor1 );
//    }
//    public static int divisor(int num1, int num2){
//        int gcd = 1;
//        int possibleDivisor = 2;
//        while(possibleDivisor<= num1 && possibleDivisor<= num2){
//            if(num1 % possibleDivisor==0 && num2 % possibleDivisor==0){
//                gcd = possibleDivisor;
//            }
//            possibleDivisor++;
//        }
//        return gcd;
//    }
//}