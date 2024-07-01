import java.util.Scanner;
public class PrimeNumberMethod{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many prime numbers would you like?");
        int numberOfPrimes = input.nextInt();
        primeNumbers(numberOfPrimes);
    }
    public static void primeNumbers(int numberOfPrime){
        int counter = 0;
        int possible = 2;
        while(counter <numberOfPrime){
            if(isPrime(possible)){
                counter++;
                if(counter % 10 == 0){
                    System.out.printf("%-5s\n",possible);
                }else{
                    System.out.printf("%-5s",possible);
                }
            }
            possible++;
        }
    }
    public static boolean isPrime(int possiblePrime){
        for(int i =2; i<=possiblePrime /2 ;i++){
            if(possiblePrime % i==0){
                return false;
            }
        }
        return true;
    }
}
//        2    3    5    7    11   13   17   19   23   29
//        31   37   41   43   47   53   59   61   67   71
//        73   79   83   89   97   101  103  107  109  113
//        127  131  137  139  149  151  157  163  167  173
//        179  181  191  193  197  199  211  223  227  229