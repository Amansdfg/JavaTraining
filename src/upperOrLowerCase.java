import java.util.Scanner;
public class upperOrLowerCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int counterOfLowerCase = 0;
        int counterOfUpperCase = 0;
        int counterOfDigit = 0;
        for(int i = 0 ; i<text.length();i++){
            char ch = text.charAt(i);
            if(Character.isUpperCase(ch)){
                counterOfUpperCase++;
            } else if (Character.isLowerCase(ch)) {
                counterOfLowerCase++;

            }else if(Character.isDigit(ch)){
                counterOfDigit++;
            }
        }System.out.println("Uppercase letters: "+counterOfUpperCase+"\nLowercase letter: "+counterOfLowerCase+"\nDigits "+counterOfDigit);

    }
}
