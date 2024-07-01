import java.util.*;
public class FindingError {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("if u enter number greater than 1 it returns 1\nif u enter 0 it returns \n0 otherwise -1");
        System.out.print("Enter number :");
        double number = input.nextDouble();
        System.out.println(method2(number));
    }
    public static int method2(double n){
        if(n>1){
            return 1;
        }else if(n == 0){
            return 0;
        }else{
            return -1;
        }
    }
}
