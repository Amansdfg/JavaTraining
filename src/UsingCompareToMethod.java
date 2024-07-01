import java.util.Scanner;
public class UsingCompareToMethod {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String aman = "dasf";
        String aman1 = "asdf";
        if(aman.compareTo(aman1)<0){
            System.out.println(aman);
        }else{
            System.out.println(aman1);
        }
    }
}
