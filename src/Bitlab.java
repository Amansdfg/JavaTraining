import java.util.Scanner;
public class Bitlab{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt(), number2 = input.nextInt(),number3 = input.nextInt(),number4 = input.nextInt();
        if(Math.abs(number1 - number2) == Math.abs(number3- number4)){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }
    }
}