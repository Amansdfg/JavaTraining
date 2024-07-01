import java.util.Arrays;
import java.util.Scanner;
public class AnagramAman {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        String word1 = input.next().toLowerCase();
        String word2 =input.next().toLowerCase();
        System.out.println(isAnagram(word1,word2,3));
    }
    public static boolean isAnagram(String word1 ,String word2,int index){
        char[] myChar1 =word1.toCharArray();
        char[] myChar2 = word2.toCharArray();
        Arrays.sort(myChar1);
        Arrays.sort(myChar2);
        if(index == 0){
            return true;
        }
        if(word1.charAt(index)==word2.charAt(index)) {
            return isAnagram(word1, word2, index - 1);
        }else{
            return false;
        }
    }
}
