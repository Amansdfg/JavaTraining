import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        int character = input.next().toLowerCase().charAt(0);
        if(character>='a' && character<='z') {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println(character + " is a vowel");
            }else {
                System.out.println(character + " is not a vowel");
            }
        }else{
            System.out.println("not a letter");
        }
    }
}
