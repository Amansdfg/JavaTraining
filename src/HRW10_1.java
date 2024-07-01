import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRW10_1 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String userInput =input.nextLine();
        char[] ch = userInput.toCharArray();
        ArrayList<String> aman  =new ArrayList<>();
        String aman1 = String.valueOf(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] >= ch[i - 1]) {
                aman1 += ch[i];
            } else {
                aman.add(aman1);
                aman1 = String.valueOf(ch[i]);
            }
        }
        aman.add(aman1);
        String result = "";
        for(int i=0;i<aman.size();i++){
            if(aman.get(i).length()>result.length()){
                result = aman.get(i);

            }
        }
        System.out.println(result);
    }
}