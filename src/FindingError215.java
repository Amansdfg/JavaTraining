import java.util.Scanner;
public class FindingError215 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        int max = maximum(number1, number2);
        System.out.println("The maximum number is " + max);

    }
    public static int  maximum(int num1 ,int num2){
        if(num1>num2) {
            return num1;
        }else {
            return num2;
        }
    }
}
