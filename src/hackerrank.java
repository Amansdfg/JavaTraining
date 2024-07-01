import java.util.Scanner;
public class hackerrank {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String first = input.next().toLowerCase();
        String second = input.next().toLowerCase();
        if(first.equals(second)){
            System.out.println("THEY ARE EQUAL");
        }else{
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}
