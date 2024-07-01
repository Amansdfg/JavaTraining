public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args){
        System.out.println("Is moon palindrome? " + isPalindrome("moon"));
        System.out.println("Is non palindrome? "+ isPalindrome("noon"));
        System.out.println("Is a palindrome ? " +isPalindrome("a"));
        System.out.println("Is aba palindrome ? "+ isPalindrome("aba"));
        System.out.println("Is asfdasfsdfsa palindrome ? "+ isPalindrome("asfdasfsdfsa"));
    }
    public static boolean isPalindrome(String word){
        if(word.length()<=1){
            return true;
        }else if(word.charAt(0)!= word.charAt(word.length()-1)){
            return false;
        }else {
            return isPalindrome(word.substring(1,word.length()-1));
        }
    }
}
