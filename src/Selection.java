import java.util.Scanner;
public class Selection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        if(number%5==0){
            System.out.println("HiFive");
        }else if(number %2==0){
                System.out.println("HiEven");
        }

    }
}
