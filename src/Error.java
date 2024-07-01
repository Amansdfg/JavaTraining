import java.util.Scanner;
public class Error {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day =input.nextInt();
        String dayInWeek = "";
        switch(day%7) {
            case 0:
                dayInWeek += "Sunday";
                break;
            case 1:
                dayInWeek += "Monday";
                break;
            case 2:
                dayInWeek += "Tuesday";
                break;
            case 3:
                dayInWeek += "Wednesday";
                break;
            case 4:
                dayInWeek += "Thursday";
                break;
            case 5:
                dayInWeek += "Friday";
                break;
            case 6:
                dayInWeek += "Saturday";
                break;
            default:
                dayInWeek += "Invalid Day";
                break;
        }
        System.out.println(dayInWeek);
    }
}
