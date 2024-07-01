import java.util.Scanner;
public class OccursXTimes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 -100");
        int[] numbers = new int[100];
        int indexOfZero = 0;
        while(true){
            int number = input.nextInt();
            if(number==0){
                break;
            }
            if(number>0 && number<=100){
                numbers[number]++;
                indexOfZero++;
            }else{
                System.out.println("Enter number between 1-100!!!");
            }
        }
        for(int i =0;i<indexOfZero;i++){
            if(numbers[i]>0){
                String times = (numbers[i]>1)?"times":"time";
                System.out.println(i+ " occurs "+ numbers[i]+ times);
            }
        }
    }
}