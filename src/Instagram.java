import java.util.Scanner;
public class Instagram {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the height of the tree");
        int height = input.nextInt();
        for(int i =0;i<height-1;i++){
            for(int j =0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=height-1-i;k++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
