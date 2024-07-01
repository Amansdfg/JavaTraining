import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        int length = password.length();
        int counterOfDigit = 0;
        int counterOfLowerCase = 0;
        int counterOfUpperCase = 0;

        for(int i = 0 ; i<=length;i++) {
            char ch = password.charAt(i);
            if (ch >= 0 && ch <= 9) {
                counterOfDigit++;
            } else if (ch >= 'a' && ch <= 'z') {
                counterOfLowerCase++;
            } else if (ch >= 'A' && ch <= 'Z') {
                counterOfUpperCase++;
            }
        }


        if(length>=8 && length<=20 && counterOfDigit>0 && counterOfLowerCase>0 && counterOfUpperCase>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}