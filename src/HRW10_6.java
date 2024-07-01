import java.util.Scanner;
public class HRW10_6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String word1 = input.nextLine();
        String word2= input.nextLine();
        for(int i =0;i<word1.length()-word2.length()+1;i++){
            String newWord =word1.substring(i,word2.length()+i);
            if(word2.equals(newWord)){
                System.out.println(i);
            }
        }
    }
}
