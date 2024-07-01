import java.util.ArrayList;
import java.util.Scanner;
public class HRW10_11 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int petya = input.nextInt();
        int valya = input.nextInt();
        ArrayList<Integer> aman=new ArrayList<>();
        int[] petyaNumbers =new int[petya];
        int[] valyaNumbers= new int[valya];
        for(int i=0;i<petyaNumbers.length;i++){
            petyaNumbers[i]=input.nextInt();
        }
        for(int j =0;j<valyaNumbers.length;j++){
            valyaNumbers[j]= input.nextInt();
        }
        for(int i  =0;i<petyaNumbers.length;i++){
            for(int j =0;j<valyaNumbers.length;j++) {
                if (petyaNumbers[i] == valyaNumbers[j]&& !aman.contains(petyaNumbers[i])) {
                   aman.add(petyaNumbers[i]);
                   break;
                }
            }
        }
        for(int i =0;i<aman.size();i++){
            System.out.print(aman.get(i));
        }
    }
}
