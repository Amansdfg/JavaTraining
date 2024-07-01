import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class HRW93Class {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n , int k){
        int singleDigit = calculateSuperDigit(n);
        return calculateSuperDigit(Integer.toString(singleDigit*k));
    }
    public static int calculateSuperDigit(String num){
        if(num.length()==1){
            return  num.charAt(0) -'A';
        }
        int sumOfNum = 0;
        for(int i : num.toCharArray()){
            sumOfNum+=i;
        }
        return calculateSuperDigit(Integer.toString(sumOfNum));
    }
}

public class HRW93 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = HRW93Class.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}