import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String word1  = input.nextLine().toLowerCase();
        String word2 = input.nextLine().toLowerCase();
        if(word1.length() ==word2.length()){
            if(anagram(word1,word2)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("both strings must have the same length");
        }
    }public static boolean anagram(String word1 , String word2){
        char[] myChar1 = word1.toCharArray();
        char[] myChar2 = word2.toCharArray();
        Arrays.sort(myChar1 ); Arrays.sort(myChar2);
        return Arrays.equals(myChar1,myChar2);
    }
}
