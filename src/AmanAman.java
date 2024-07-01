import java.util.Scanner;
public class AmanAman {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int max = number;
        int counter = 1;

        while (number != 0) {
            number = input.nextInt();
            if (number == max) {
                counter++;
            }
            if (number > max) {
                max = number;

            }
        }
        System.out.println(counter);
    }
}
