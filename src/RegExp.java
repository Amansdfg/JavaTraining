import java.util.Scanner;
import java.util.SimpleTimeZone;
public class RegExp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is my life".matches("Java.*"));
        System.out.println("Java is o independent  language".matches("Java.*"));
        System.out.println("Java".contains("j"));
        System.out.println("8-747-539-70-59".matches("\\d-\\d{3}-\\d{3}-\\d{2}-\\d"));
        String word = "Aman,Kalabay.Sholpan";
        String[] words = word.split("[,.]");
        for (String i : words) {
            System.out.println(i);
        }
        char[] chs = "Aman".toCharArray();
        for (char i : chs) {
            System.out.println(i);
        }
        try{
            int value=20;
            if(value<100){
                throw new Exception("Number is under 20");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
