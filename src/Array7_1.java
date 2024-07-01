import java.util.Scanner;
public class Array7_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the student: ");
        int numberOfTheStudent = input.nextInt();
        int[] student = new int[numberOfTheStudent];
        System.out.print("Enter" + numberOfTheStudent+ " scores: ");
        for(int i=0;i<numberOfTheStudent;i++){
            student[i] = input.nextInt();
        }
        for(int i=0;i<numberOfTheStudent;i++){
            System.out.println("Student "+ i+" score is "+ student[i]+ " and grade is "+ grade(student[i]));
        }
    }
    public static char grade(int score){
        if(score>=70) {
            return 'A';
        }else if(score>=50){
            return 'B';
        }else if(score>=30){
            return'C';
        }else {
            return'F';
        }
    }
}
