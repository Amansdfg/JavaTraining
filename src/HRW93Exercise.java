import java.util.Scanner;
public class HRW93Exercise {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter word: ");
        String word =input.nextLine();
        System.out.println("How many time you would like? ");
        int number= input.nextInt();
        String newWord="";
        for(int i=0;i<number;i++){
            newWord+=word;
        }
        System.out.println(newWord);
    }

}
