import java.util.Scanner;
public class AmanLn{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many time?");
        int number = input.nextInt();
        nPrintln("HEllo Aman" , number);
    }
    public static void nPrintln(String text, int n){
        for(int i =0;i<n;i++){
            System.out.println(text);
        }
    }
}

