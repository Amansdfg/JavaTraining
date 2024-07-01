import java.util.Scanner;
public class OccurXTime {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int[] numbers = new int[100];
        int index=0;
        while(true){
            int number=input.nextInt();
            if(number==0){
                break;
            }
            for(int i =0;i<numbers.length;i++){
                numbers[number]++;
                index++;
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0) {
                System.out.print(i+ "occurs "+ index +((index==1)?" time": " times"));
            }
        }
    }
}
