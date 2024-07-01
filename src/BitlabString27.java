import java.util.Scanner;
public class BitlabString27 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number1 = input.nextInt();
        char operator1= input.next().charAt(0);
        int number2 =input.nextInt();
        char operator2 = input.next().charAt(0);
        int number3 =input.nextInt();
        int result = 0;
        for(int i =0;i<3;i++){
            if(operator1 =='+'){
                result = number1 + number2;
            }else if(operator1 == '-'){
                result= number1 - number2;
            }else if( operator1== '*'){
                result = number1 * number2;
            }else {
                result = number1/ number2;
            }
        }
        int result2 = result;
        for(int i =0;i<3;i++){
            if(operator2 == '+'){
                result2 = result+ number3;
            }else if(operator2=='-'){
                result2= result- number3;
            }else if(operator2=='*'){
                result2 = result*number3;
            }else{
                result2=result/number3;
            }
        }
        System.out.println(result2);
    }
}
