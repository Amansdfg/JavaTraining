import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRW_73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthOfNumber = input.nextInt();
        int[] numbers = new int[lengthOfNumber];
        for(int i =0 ; i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        int max = 0;
        int previous= 0;
        for(int i =0;i<numbers.length;i++){
           if(numbers[i]>max){
               max = numbers[i];
           }
        }
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i]==max){
                previous=numbers[i-1];
                break;
            }
        }
       System.out.println((max-previous)+" "+max);
    }
}