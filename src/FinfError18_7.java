import java.util.Scanner;
public class FinfError18_7 {
    public static Scanner input =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter nonnegative integer:");
        int number = input.nextInt();
        System.out.println(MathAman(number));
    }
    public static int MathAman(int number){
        if(number==1){
            return 1;
        }else{
            return number + MathAman(number-1);
        }
    }
}
