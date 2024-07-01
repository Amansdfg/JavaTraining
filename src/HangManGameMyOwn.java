import java.util.*;
public class HangManGameMyOwn{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        Random random= new Random();
        String[ ] words = {"Aman","Kalabay","Sholpan","Almaty","Kalskelen","Aibek"};
        char playAgain;
        do{
            String word = words[random.nextInt(words.length)];
            char[] displayWord =new char[word.length()];
            boolean[] guessed= new boolean[word.length()];
            System.out.println("Welcome to Hangman!!");
            for(int i=0;i<word.length();i++){
                displayWord[i] ='*';
            }
            int counterOfMisses = 0;
            while(true){
                boolean missed = true;
                System.out.print("(Guess) Enter a letter in the word "+ new String(displayWord)+" > ");
                char userInput = input.next().charAt(0);
                for(int i=0;i<word.length();i++){
                   if(word.charAt(i)==userInput&& !guessed[i]){
                       displayWord[i]= userInput;
                       guessed[i] =true;
                       missed =false;
                   }
                }
                if(missed){
                    System.out.println(userInput + " this letter is not in the  word.");
                    counterOfMisses++;
                }
                if(new String(displayWord).equals(word)){
                    System.out.println("Yes the word is "+ word+" You missed "+ counterOfMisses + ((counterOfMisses==1)?" time": " times"));
                    break;
                }
            }
            System.out.print("Do you want to guess another word?Enter y or n >");
            playAgain= input.next().charAt(0);
        }while(playAgain=='y');
    }
}