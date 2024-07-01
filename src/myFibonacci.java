import java.util.Scanner;
public class myFibonacci{
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }else{
            return fibonacci(num -1) + fibonacci(num -2);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        System.out.println(fibonacci(number));
    }
}
