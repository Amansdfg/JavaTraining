import java.util.Scanner;
public class AnalyzeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int number =  input.nextInt();
        double[] array = new double[number];
        System.out.println("Enter the number: ");
        double counter = 0;
        for(int i = 0 ; i< array.length ; i++){
            array[i]  = input.nextDouble();
            counter +=array[i];
        }
        double average = counter / number;
        System.out.println("The average is "+ average);
        int numbersAreAboveAverage = 0;
        for (double aman : array) {
            if (aman > average) numbersAreAboveAverage++;
        }
        System.out.println("Number of elements above the average is "+numbersAreAboveAverage);
    }
}