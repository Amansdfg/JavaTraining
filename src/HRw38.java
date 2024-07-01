import java.util.Scanner;
public class HRw38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word =input.nextLine();
        String reverse ="";
        for(int i = word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
