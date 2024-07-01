import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.println("this is prime check \nEnter the number");
        int number = input.nextInt();
        for(int i = 2;i<number -1;i++){
            if(number %i==0){
                System.out.println("NO");
            }
        }System.out.println("YES");
    }
}