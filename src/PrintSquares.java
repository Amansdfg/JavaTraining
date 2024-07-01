import java.util.Scanner;

public class PrintSquares{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        aman(word);
    }
    public static void aman(String word){
        char first = word.charAt(0);
        if(word.length()==1){

            if(Character.isLowerCase(first)){
                first =Character.toUpperCase(first);
            }else{
                first =Character.toLowerCase(first);
            }
        }
        String aman="";
        for(int i =1;i<word.length();i++) {
            char other = word.charAt(i);

            if (Character.isLowerCase(first) && Character.isUpperCase(other)) {
                first = Character.toUpperCase(first);
                aman += Character.toLowerCase(other);
            } else if(Character.isUpperCase(first) && Character.isUpperCase(other)) {
                first = Character.toLowerCase(first);
                aman += Character.toLowerCase(other);
            }else if(Character.isUpperCase(first) && Character.isLowerCase(other)) {
                first = Character.toUpperCase(first);
                aman += Character.toLowerCase(other);
            }

        }
        System.out.println(first + "" + aman);
    }
}
