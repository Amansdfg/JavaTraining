//import java.util.Scanner;
//public class PrintCalendar{
//    public static void main(String [] args){
//        Scanner input = new Scanner;
//        System.out.println("Enter a year ");
//        int year = input.nextInt();
//        System.out.println("Enter a month");
//        int month = input.nextInt();
//        printMonth(year,month);
//    }
//    public static void printMonth(int year , int month){
//        printMonthTitle(year,month);
//        printMonthBody(year , month);
//    }
//    public static void printMonthTitle(int year ,int month){
//        System.out.println("         "+ getMonthName(month)+"   "+ year);
//        System.out.println("_________________________");
//        System.out.println(" Sun Mon Tue Wen Thu Fri Sat");
//    }
//    public static String getMonthName(int month){
//        String monthName ="";
//        switch (month){
//            case 1: monthName = "January";break;
//            case 2: monthName = "February";break;
//            case 3: monthName = "March";break;
//            case 4: monthName = "April";break;
//            case 5: monthName = "May";break;
//            case 6: monthName = "June";break;
//            case 7: monthName = "July";break;
//            case 8: monthName = "August";break;
//            case 9: monthName = "September";break;
//            case 10: monthName = "October";break;
//            case 11: monthName = "November";break;
//            case 12: monthName = "December";break;
//        }
//        return monthName;
//    }
//    public static void printMonthBody(int year,int month){
//        int starDay = getStartDay(year , month);
//        int numberOfDays = getNumberOfDaysInMonth(year,month);
//        for(int i =0 ;i< starDay;i++){
//            System.out.println("    ");
//        }
//        for(int i = 0;i <numberOfDays;i++){
//            System.out.printf("%4d",i);
//            if((i+starDay)%7==0){
//                System.out.println();
//            }
//
//        }
//        System.out.println();
//
//    }
//    public static int getStartDay(int year, int month){
//        int
//    }
//
//
//}