import java.util.*;
public class FindError18_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nonnegative integer: ");
        int number = input.nextInt();
        System.out.println("the power of "+ number + " is "+ aman(number));
    }
    public static int aman(int number){
        if(number==0){
            return 1;
        }else{
            return 2* aman(number-1);
        }
    }
}
