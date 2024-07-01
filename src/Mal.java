import java.util.Scanner;
public class Mal{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String userInput = input.nextLine();
        if(userInput.contains(",")) {
            int index = userInput.indexOf(",");
            System.out.println(userInput.substring(index+1));
        }
    }
}
