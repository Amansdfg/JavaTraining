import java.util.Scanner;
public class abcde{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of length array:");
        int length1 = input.nextInt();
        int[]  number = new int[length1];
        System.out.println("Enter the numerbers of elements of the array: ");
        for(int i = 0;i<number.length;i++){
            number[i] = input.nextInt();
        }
        int max = 0;
        for(int i = 0; i < length1; i++){
            if(max <number[i])

                max = number[i];
        }
        System.out.println("max : "+max);
    }
}