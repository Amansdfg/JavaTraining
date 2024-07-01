import java.util.*;
public class TestRandomCharacter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many characters would you like?");
        int numbersOfCharacters = input.nextInt();
        System.out.println("How about char per line");
        int newLine = input.nextInt();
        for(int i= 0;i<numbersOfCharacters ; i++){
            char ch = RandomCharacter.getRandomLowerCase();
            if((i +1)% newLine== 0){
                System.out.printf("%-2s \n",ch);
            }else{
                System.out.printf("%-2s",ch);
            }
        }
    }
}
