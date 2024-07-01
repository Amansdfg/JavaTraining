package BitLab;

import java.util.Scanner;
public class BitLabReverse{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String word1= input.nextLine();
        String word2 = input.nextLine();
        String word ="";
        for(int i =word1.length()-1;i>=0;i--){
            char ch = word1.charAt(i);
            word += ch;
        }
        System.out.println(word2);
        System.out.println(word1);
        System.out.println(word);
        if(word.equals(word2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
