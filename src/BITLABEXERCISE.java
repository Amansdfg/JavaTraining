import java.util.Scanner;
public class BITLABEXERCISE{
    public static void mian(String[] args){
        Scanner input =new Scanner(System.in);
        int number =input.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=(int)Math.pow(i,2);
        }
        System.out.println(sum);
    }
}