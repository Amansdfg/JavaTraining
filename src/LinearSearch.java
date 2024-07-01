import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int number = input.nextInt();
        int[] numbers= new int[number];
        System.out.println("Enter the number of the array");
        for(int i =0;i<numbers.length;i++){
            numbers[i] =input.nextInt();
        }
        System.out.println("Enter the number that you would like.");
        int key = input.nextInt();
        System.out.println(linearSearch(numbers,key));
        input.close();
    }

    public static int linearSearch(int[] numbers,int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }return -1;
    }
}
