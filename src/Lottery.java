import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long starttime =System.currentTimeMillis();
        System.out.println("How many taks wpuld you like to solve");
        int task = input.nextInt();
        String output = "";
        int countCorrect = 0;
        int count = 0;
        while(count<task){
            int number1 = (int) (Math.random()*10);
            int number2 = (int) (Math.random() *10);
            if(number2>number1){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is "+number1+" - "+number2+ " ? ");
            int answer = input.nextInt();
            if(number1 - number2==answer){
                countCorrect++;
            }else{
                System.out.println("You are wrong answer should be"+(number1-number2));
            }
            count++ ;
            output +="\n"+ number1 + " - "+number2 + " = "+answer+((number1-number2==answer)?"correct":"incorrect");
        }
        long endtime = System.currentTimeMillis();
        long time = endtime - starttime;
        System.out.println("Correct count is" + countCorrect);
        System.out.println("Test time is "+time/1000 +"seconnd");
        System.out.println(output);
    }
}
