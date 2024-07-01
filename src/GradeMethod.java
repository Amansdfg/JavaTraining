import java.util.Scanner;
public class GradeMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This is grade counting!!!");
        System.out.println("Enter your score");
        int score  = input.nextInt();
        System.out.println("Your grade is " + Grade(score));
    }
    public static char Grade(int point){
        char grade;
        if(point>=90 && point<=100) {
            grade = 'A';
        }else if(point>=80  && point<=90){
            grade = 'B';
        }else if(point>=70 && point<=80) {
            grade = 'C';
        }else if(point>=60 && point <=70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
}
