import java.util.*;
public class GanerateCharacter {{}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This is generatering character between your fist letter and the the second letter");
        System.out.println("Enter your first character");
        String str1 = input.next();
        System.out.println("Enter your second character");
        String str2 =input.next();
        char ch1 = str1.charAt(0);
        char ch2 = str2.charAt(0);
        System.out.println((char) (ch1 + Math.random() *(ch2 -ch1 +1)));
    }
}
