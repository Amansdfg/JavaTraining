
import java.util.Scanner;
import java.util.ArrayList;
public class maxNumberByRecursive{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        ArrayList<Integer> aman = new ArrayList<>();
        aman.add(input.nextInt());
        aman.add(input.nextInt());
        aman.add(input.nextInt());
        System.out.println(maxNumber(aman,3));
    }
    public static int maxNumber(ArrayList<Integer> aman, int index){
        if(index == 0){
            return 0;
        }
        int max = maxNumber(aman, index-1);
        if(aman.get(index-1)>max){
            return aman.get(index-1);
        }else{
            return max;
        }
    }
}