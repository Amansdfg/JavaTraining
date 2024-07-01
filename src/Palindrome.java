import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        int firstToMiddle = 0;

        int middleToLast = word.length() - 1;
        boolean isPalindrome = true;
        while(firstToMiddle< middleToLast){
            if(word.charAt(firstToMiddle)!=word.charAt(middleToLast)){
                isPalindrome= false;
                break;
            }
            firstToMiddle++;
            middleToLast--;
        }if(isPalindrome){
            System.out.println("The word is palindrome");
        }else{
            System.out.println("The word is not palindrome");
        }

    }
}
