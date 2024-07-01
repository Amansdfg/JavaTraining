public class RecursivePalindrome {
    public static void main(String[] args){
        System.out.println("Is moon palindrome? " + isPalindrome("moon"));
        System.out.println("Is non palindrome? "+ isPalindrome("noon"));
        System.out.println("Is a palindrome ? " +isPalindrome("a"));
        System.out.println("Is aba palindrome ? "+ isPalindrome("aba"));
        System.out.println("Is asfdasfsdfsa palindrome ? "+ isPalindrome("asfdasfsdfsa"));
    }public static boolean isPalindrome(String word, int low , int high){
        if(low>=high){
            return true;
        }else if(word.charAt(low)!=word.charAt(high)){
            return false;
        }else{
            return isPalindrome(word,low+1,high-1);
        }
    }
    public static boolean isPalindrome(String word){
        return isPalindrome(word,0,word.length()-1);
    }
}
