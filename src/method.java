import java.util.Scanner;
public class method {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        System.out.println(grade1(score));
    }
    public static char grade1(int score){
        if(score>=90){
            return 'A';
        }else if(score>=80){
            return 'B';
        }else if(score>=70){
            return 'C';
        }else if (score>=60){
            return 'D';
        }else{
            return 'E';
        }
    }
}