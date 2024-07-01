import java.util.ArrayList;
import java.util.Scanner;
public class HRW10_8 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String word =input.nextLine();
        ArrayList<Character> aman = new ArrayList<>();
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!aman.contains(ch)){
                aman.add(ch);
            }
        }
        for(char i :aman){
            System.out.print(i);
        }
    }
}
