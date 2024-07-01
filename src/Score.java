import java.util.Scanner;
public class Score {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = input.nextInt();
        char grade;
        if(score>=0 && score<=100){
            if(score>=90){
                grade = 'A';
            }else if(score >=80){
                grade = 'B';
            }else if(score>=70){
                grade = 'C';
            }else if(score>=60){
                grade = 'D';
            }else {
                grade = 'F';
            }
            System.out.println("Your grade is " + grade);
        }else{
            System.out.println("Enter a number between 0 -100");
        }
    }
}
