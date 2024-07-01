import java.util.Scanner;
public class ArrowCounter {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String userInput= input.nextLine();
        System.out.println( counterOfTheArrows(userInput));
    }
    public static int counterOfTheArrows(String userInput){
        int lengthOfTheUserInput = userInput.length();
        if(lengthOfTheUserInput<5){
            return 0;
        }
        int aman = counterOfTheArrows(userInput.substring(1));
        if(userInput.substring(0,5).equals(">>-->")|| userInput.substring(0,5).equals("<--<<")){
            return 1 + aman;
        }else{
            return  aman;
        }
    }
}
