import java.util.Scanner;
public class error6_12 {
    public static void main(String[] args){
        Scanner input =  new  Scanner(System.in);
        System.out.print("Enter your text:");
        String text = input.nextLine();
        System.out.println("How manu time would you like");
        int number = input.nextInt();
        Aman(text,number);
    }
    public static void Aman(String text1 , int number1){
        for(int i = 0; i<number1; i++){
            System.out.println(text1);
        }
    }
}
