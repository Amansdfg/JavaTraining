import java.util.Scanner;
public class Task{
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        double result = input.nextDouble();

        System.out.println("The grade is " + grade(result));
    }
    public static char grade(double score){
        if(score>=90.0){
            return 'A';
        }else if (score >=80.0){
            return 'B';
        }else if (score >=70.0){
            return 'C';
        }else if(score >=60.0){
            return 'D';
        }else{
            return 'F';
        }
    }
}