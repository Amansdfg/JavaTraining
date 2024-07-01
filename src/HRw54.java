import java.util.Scanner;
public class HRw54 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max;
        int number = input.nextInt();
        max=number;
        while(number != 0){
            number = input.nextInt();
            if(number>max){
                max = number;
            }
        }System.out.println(max);
    }
}
