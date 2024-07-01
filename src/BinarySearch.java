import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int number = input.nextInt();
        int[] numbers = new int[number];
        System.out.println("Enter the number of the array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter the number that you would like.");
        int key = input.nextInt();
        System.out.println(binarySearch(numbers, key));
        input.close();
    }
    public static int binarySearch(int[] numbers, int key){
        int low = 0;
        int high = numbers.length-1;
        while(low<= high){
            int mid = (low+high)/2;
            if(key<numbers[mid]){
                high=mid-1;
            }else if(key ==numbers[mid]){
                return mid;
            }else{
                low=mid+1;
            }
        }
        return -low-1;
    }
}
