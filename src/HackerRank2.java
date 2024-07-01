import java.util.ArrayList;
import java.util.Scanner;
public class HackerRank2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        ArrayList<String> myString = new ArrayList<>();
        ArrayList<String> myInteger = new ArrayList<>();
        for(int i =0;i<3;i++){
            myString.add(input.nextLine());
            myInteger.add(input.nextLine());
        }
        System.out.println("================================");
        for(int i=0;i<3;i++){
            System.out.println(myString.get(i)+"              "+((myInteger.get(i).length()>=3)?myInteger.get(i): 0+""+myInteger.get(i)));
        }
        System.out.println("================================");
    }
}
