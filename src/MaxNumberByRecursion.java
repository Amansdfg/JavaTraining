import java.util.Scanner;
import java.util.ArrayList;
public class MaxNumberByRecursion {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        ArrayList<Integer> aman = new ArrayList<>();
        aman.add(input.nextInt());
        aman.add(input.nextInt());
        aman.add(input.nextInt());
        System.out.println(maxNumber(aman,3));
    }
    public static int maxNumber(ArrayList<Integer> aman , int index){
        if(index ==0){
            return 0 ;
        }
        if(aman.get(index-1)>maxNumber(aman,index-1)){
            return aman.get(index-1);
        }else{
            return maxNumber(aman,index-1);
        }
    }

}
