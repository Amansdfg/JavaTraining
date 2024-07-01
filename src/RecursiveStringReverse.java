import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;
public class RecursiveStringReverse {
    public static int counter=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        int number =input.nextInt();
        word(userInput,number,"");
//        System.out.println(fibonacci(userInput));
//        int low = 0;
//        int high= userInput.length()-1;
//        System.out.println(isPalindrome(userInput,low,high));
//        System.out.println(factiorial(userInput));
//        System.out.println(sum(userInput));

//      System.out.println(reversedString(userInput));
    }
    public static boolean polindrome(String word){
        if(word.length()==1 || word.length()==0){
            return true;
        }
        if(word.charAt(0) ==word.charAt(word.length()-1)){
            return polindrome(word.substring(1,word.length()-1));
        } return false;
    }
   public static int sum(int number){
        if(number==1){
            return 1;
        }else{
            return number +sum(number -1);
        }
   }
   public static int factiorial(int number){
        if(number ==1){
            return 1;
        }else{
            return number* factiorial(number-1);
        }
   }
   public static String reversedString(String word){
        if(word.length()==1){
            return word;
        }else{
            return word.charAt(word.length()-1)+reversedString(word.substring(0,word.length()-1));
        }
   }
   public static boolean isPalindrome(String word,int low,int high){

        if(low>high){
            return true;
        }else if(word.charAt(low)!=word.charAt(high)){
            return false;
        }else{
            return isPalindrome(word, low+1,high-1);
        }
   }
   public static int fibonacci(int number){
        if(number==0){
            return 0;
        }else if(number ==1){
            return 1;
        }else{
            return fibonacci(number-1)+fibonacci(number-2);
        }
   }
   public static void word(String word , int number ,String aman){
        if(aman.length()==number){
            System.out.println(aman);
            return;

        }
        for(int i=0;i<word.length();i++){
            word(word,number , aman+ word.charAt(i));
        }
   }
}
