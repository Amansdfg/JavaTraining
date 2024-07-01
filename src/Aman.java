import java.util.Scanner;
public class Aman{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input  ends 0: ");
        int number = input.nextInt();
        double sum = 0;
        int numberOfPositive = 0;
        int numberOfNegative = 0;
        double counter=0;
        while(number!=0){
            number = input.nextInt();
            if(number>0){
                numberOfPositive++;
            }else if(number<0){
                numberOfNegative++;
            }
            sum+=number;
            counter++;

        }
        System.out.println("The number of positives is "+numberOfPositive);
        System.out.println("The number of negative is "+numberOfNegative);
        System.out.println("The total is " + sum);
        System.out.println("the average is "+sum/counter);
    }
}