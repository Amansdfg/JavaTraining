import java.util.Scanner;
public class ComputeFactorial {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter nonnegative integer: ");
        int number = input.nextInt();
        System.out.println("factorial of "+ number+ " is "+ factorial(number));
    }
    public static int factorial(int number){
        if(number==0){
            return 1;
        }else {
            return number * (factorial(number - 1));
        }
    }
}
