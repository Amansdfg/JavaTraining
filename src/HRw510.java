import java.util.Scanner;
public class HRw510{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int number3 = input.nextInt();
            int aman = number1;
            for(int j = 0 ; j<number3;j++){
                aman+=Math.pow(2,j)*number2;
                System.out.print(aman+ " ");
            }
        }
    }

}
