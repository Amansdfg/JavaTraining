import java.util.Scanner;
public class FindError18_6 {
    public static Scanner input =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("This is compute power .");
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println("Enter a power of number :"+ number);
        int power = input.nextInt();
        System.out.println(powerOfNumber(number,power));
    }
    public static int powerOfNumber(int number ,int power){
        if(power ==0){
            return 1;
        }else{
            return number * powerOfNumber(number,power-1);
        }
    }
}
