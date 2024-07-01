import java.util.Scanner;
public class PolimdromWithLoop {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter word  : ");
        String word = input.nextLine();
        int low= 0;
        int high =word.length()-1;
        boolean isPolidtome = true;
        while(low<high){
            if(word.charAt(low)!=word.charAt(high)){
                isPolidtome=false;
                break;
            }
            low++;
            high--;
        }
        if(isPolidtome){
            System.out.println(word + " is palidrome");
        }else{
            System.out.println(word  + " is not palidrome");
        }
    }
}
