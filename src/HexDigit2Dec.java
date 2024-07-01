import java.util.Scanner;
public class HexDigit2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit:");
        String hexString = input.nextLine();
        if(hexString.length()!=1){
            System.out.println("Enter a one character");

        }char ch =hexString.charAt(0);
        if(ch>'A' && ch<'F'){
            int value = ch-'A' +10;
            System.out.println(value);
        }
    }

}
