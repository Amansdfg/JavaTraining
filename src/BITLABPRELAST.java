import java.util.Scanner;
public class BITLABPRELAST{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }
}
