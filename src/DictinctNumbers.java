import java.util.Scanner;
import java.util.ArrayList;
public class DictinctNumbers {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        ArrayList<Integer> aman =new ArrayList<>();
        System.out.print("Enter numbers(input ends with 0:");
        int number;
        do{
            number = input.nextInt();
            if(number!=0 && !aman.contains(number)){
                aman.add(number);
            }
        }while(number!=0);

        for(int i=0;i<aman.size();i++){
            System.out.print(aman.get(i)+ " ");
        }
        System.out.println();
    }
}
