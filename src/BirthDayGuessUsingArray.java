import java.util.Scanner;
public class BirthDayGuessUsingArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a game birth day guesser.");
        int day = 0;
        int[][][] days = {{{1, 3, 5, 7},
                {9, 11, 13, 15},
                {17, 19, 21, 23},
                {25, 27, 29, 31}},
                {{2, 3, 6, 7},
                        {10, 11, 14, 15},
                        {18, 19, 22, 23},
                        {26, 27, 30, 31}},
                {{4, 5, 6, 7},
                        {12, 13, 14, 15},
                        {20, 21, 22, 23},
                        {28, 29, 30, 31}},
                {{8, 9, 10, 11},
                        {12, 13, 14, 15},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}},
                {{16, 17, 18, 19},
                        {20, 21, 22, 23},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}}};


        for (int i = 0; i < days.length; i++) {
            System.out.println("Is your birth day int this set "+i+ "?");
            for(int j =0;j<days[i].length;j++){
                for(int k=0;k<days[i][j].length;k++){
                    System.out.printf("%4d",days[i][j][k]);
                }
                System.out.println();
            }
            System.out.println("Enter 0 for No and 1 for Yes");
            int userInput = input.nextInt();
            if(userInput ==1){
                day+=days[i][0][0];
            }
            System.out.println("Your birth day is "+ day);
        }
    }
}