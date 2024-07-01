import java.util.Scanner;
public class HW10_9 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        boolean[] isPrime = new boolean[number+1];
        for(int i = 0;i<isPrime.length;i++){
            isPrime[i]=true;
        }
        for(int i =2;i<=number/i;i++){
            if(isPrime[i]){
                for(int j = i;j<=number / i;j++){
                    isPrime[i*j]=false;
                }
            }
        }
        int counter = 0;
        for(int i =2;i<isPrime.length;i++){
            if(isPrime[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
