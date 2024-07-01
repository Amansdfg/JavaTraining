import java.util.Scanner;
public class HRW67{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        aman(word);
    }
    public static void aman(String word){
        String aman1= "";
        char first = word.charAt(0);
        for(int i =1;i<word.length();i++){
            char ch =word.charAt(i);
            if(Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(ch)){
                first =Character.toUpperCase(word.charAt(0));
                aman1 += Character.toLowerCase(ch);
            }else if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(ch)){
                first = Character.toLowerCase(word.charAt(0));
                aman1 += Character.toLowerCase(ch);
            }else if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(ch)){
                first = Character.toUpperCase(word.charAt(0));
                aman1 += Character.toLowerCase(ch);
            }else if(Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(ch)){
                first = Character.toUpperCase(word.charAt(0));
                aman1 += Character.toUpperCase(ch);
            }else if(Character.isLowerCase(word.charAt(0))){
                first =Character.toUpperCase(word.charAt(0));
            }else if(Character.isUpperCase(word.charAt(0))){
                first =Character.toLowerCase(word.charAt(0));
            }
        }
        System.out.println(first+aman1);
    }
}