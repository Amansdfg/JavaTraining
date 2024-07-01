import java.util.Scanner;
public class Aman230103375{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int space = text.indexOf(" ");
        String string1 = text.substring(0,space);
        String string2 = text.substring(space +1);
        int count = 0;
        for(int i = 0;i<=string1.length()-string2.length();i++){
            String name = string1.substring(i,string2.length()+i);
            if(name.equals(string2)){
                count++;
            }
        }System.out.println(count);
    }
}