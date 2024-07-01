import java.util.Scanner;
public class HRW10_13{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        String word3 = input.nextLine();
        if(aman(word1,word2,word3)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }public static boolean aman(String word1 , String word2 , String word3){
        char[] myWord1 =word1.toCharArray();
        char[] myWord2 =word1.toCharArray();
        char[] myWord3 =word1.toCharArray();
        boolean result = true;
        for(int i =0;i<myWord1.length;i++){
            boolean isFound = false;
            for(int j=0;j<myWord3.length;j++){
                if(myWord1[i]==myWord3[j]){
                    isFound= true;
                    break;
                }
            }
            if(!isFound){
                result=false;
                break;
            }
        }
        for(int i =0;i<myWord2.length;i++){
            boolean isFound = false;
            for(int j=0;j<myWord3.length;j++){
                if(myWord2[i]==myWord3[j]){
                    isFound= true;
                    break;
                }
            }
            if(!isFound){
                result=false;
                break;
            }
        }
        return result;
    }
}