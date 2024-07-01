import java.util.Scanner;
public class HRW10_7 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int number1 =input.nextInt();
        int number2 =input.nextInt();
        int counter=0;
        while(number1>0&& number2>0) {
            if (number2 > number1) {
                number2 = number2 - number1;
                counter++;
            } else {
                number1 = number1-number2;
                counter++;
            }

        }

        System.out.println(counter);
    }
}
