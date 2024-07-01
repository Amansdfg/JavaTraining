import java.util.Scanner;
public class Hex2Dec{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program is convert hexadecimal value for decimal number \nEnter hexadecimal number");
        String hexadecimal = input.nextLine();
        System.out.println("The decimal value for hex number " + hexadecimal + " is " + hexToDecimal(hexadecimal.toUpperCase()));
    }
    public static int hexToDecimal(String hex){
        int decimal = 0;
        for(int i = 0 ; i<hex.length();i++){
            char ch = hex.charAt(i);
            decimal = decimal *16 +hexCharToDec(ch);
        }
        return decimal;
    }
    public static int hexCharToDec(char ch){
        if(ch>='A' && ch<='Z'){
            return ch-'A'+10;
        }else{
            return ch-'0';
        }
    }

}