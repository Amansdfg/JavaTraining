import java.util.Scanner;
public class MiniTw {
    public static void main(String[] args){
        Scanner input  =new Scanner(System.in);
        int max = 0;
        int max1 = 0;
        int number ;
        while(true){
            number = input.nextInt();
            if(number==0){
                break;
            }
            if(number>max){
                max= number;
            }
            if(number>max1&&number<max){
                max1= number;
            }
        }
        System.out.println(max1+" "+max);
    }
}
