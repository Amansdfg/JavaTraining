import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Find prime numbers <=number, Enter number");
        int number= input.nextInt();
        int possible = 2;
        int counter=0;
        while(possible<=number){
            boolean isPrime = true;
            for(int divisor =2;divisor<=(int)(Math.sqrt(possible));divisor++){
                if(possible%divisor==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                counter++;
                if(counter%10==0){
                    System.out.printf("%5d\n",possible);
                }else{
                    System.out.printf("%5d", possible);
                }

            }
            possible++;
        }System.out.println(counter+ " prime numbers less or equal than "+number );

    }
}