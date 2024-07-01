import java.util.Scanner;
public class acddaa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of length array:");
        int length1 = input.nextInt();
        int[]  number = new int[length1];
        System.out.println("Enter the numerbers of elements of the array: ");
        for(int i = 0;i<number.length;i++){
            number[i] = input.nextInt();
        }
        System.out.println("Array elments:");
        for(int i = 0; i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
