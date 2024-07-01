import java.util.Scanner;
public class ComputeFibonacci {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter index of number : ");
        int number = input.nextInt();
        System.out.println(fibonacci(number));
    }
    public static int fibonacci(int index){
        if(index==0){
            return 0;
        }else if(index ==1){
            return 1;
        }else{
            return fibonacci(index-2)+ fibonacci(index-1);
        }
    }
}
