import java.util.Scanner;
public class powerOfTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        int count = 0;
        while(count<=number){
            if((number>0) &&((number & (number - 1)) == 0)){
                System.out.println("YES\nEnter a number :");
                number = input.nextInt();
                count ++;
            }else{
                System.out.println("NO\nEnter a number :");
                number = input.nextInt();
                count++;
            }
        }
    }
}