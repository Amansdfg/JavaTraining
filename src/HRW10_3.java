import java.util.Scanner;
import java.util.ArrayList;
public class HRW10_3{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int userInput = input.nextInt();
        while(userInput!=0){
            numbers.add(userInput);
            userInput = input.nextInt();
        }
        System.out.println(aman(numbers));

    }public static String aman(ArrayList<Integer> numbers){
        int number = numbers.get(0);
        int numberPossible = numbers.get(0);
        int length  =1;
        int lengthPossible =1;
        int index = 0;
        int indexPossible = 0;
        for(int i =1;i<numbers.size();i++){
            if(numbers.get(i)==numbers.get(i-1)){
                lengthPossible++;
            }else{
                if(lengthPossible>length){
                    length = lengthPossible;
                    number = numberPossible;
                    index = indexPossible;
                }
                lengthPossible=1;
                indexPossible= i;
                numberPossible = numbers.get(i);
            }
        }
        if(lengthPossible>length){
            length=lengthPossible;
            number = numberPossible;
            index = indexPossible;
        }
        if(length>1){
           return ("starts at index "+ index+" with "+length+" values of "+ number);
        }else{
            return "Not found";
        }
    }
}