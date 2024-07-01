import java.util.Scanner;
public class MessageXTimes {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your message :");
        String message = input.nextLine();
        System.out.println("Enter number");
        int number = input.nextInt();
        nPrint(message,number);
    }
    public static void nPrint(String message,int number){
        if(number >0){
            System.out.println(message);
            nPrint(message,number-1);
        }
    }
}
