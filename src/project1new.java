//import java.util.Scanner;
//public class project1new {
//    static String[] name = new String[100];
//    static int[] id = new int[100];
//    static int[] score = new int[100];
//    static char[] grade = new char[100];
//    static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        if (logIn()) {
//            int option;
//            do {
//                mainManu();
//                System.out.println("select by number:");
//                option = input.nextInt();
//                switch (option) {
//                    case 1: add();break;
//                    case 2: manage();break;
//                    case 3: calculate();break;
//                    case 4: statistics();break;
//                    case 5: report();break;
//                    case 6: delete();break;
//                    case 0: logOut();break;
//                    default: System.out.println("Enter number between 0 -6(including)");
//                }
//            } while (option != 0);
//
//        }
//    }
//
//    public static boolean logIn() {
//        while (true) {
//            System.out.print("Enter your username:");
//            String username = input.nextLine();
//            System.out.print("Enter your password:");
//            String password = input.nextLine();
//            if (username.equals("Aman") && password.equals("Aman")) {
//                System.out.println("Successfully authorize.");
//                break;
//            } else {
//                System.out.println("Try again");
//            }
//        }
//        return true;
//    }
//
//    public static void mainManu() {
//        System.out.println("""
//                Main Menu
//                1. Add Student
//                2. Manage Records
//                3. Calculate Grades
//                4. View Statistics
//                5. Generate Reports
//                6. Delete Student
//                0.Logout and exit""");
//    }
//
//    public static void add() {
//        for (int i = 0; i < name.length; i++) {
//            if (name[i] == null) {
//                System.out.println("Enter student name:");
//                name[i] = input.nextLine();
//                input.nextLine();
//                System.out.println("Enter student id number:");
//                id[i] = input.nextInt();
//                System.out.println("Enter student test score");
//                score[i] = input.nextInt();
//                System.out.println("Student added successfully.");
//
//            }
//        }
//    }
//
//    public static void manage() {
//        System.out.println("Enter student ID to edit:");
//        int manageId = input.nextInt();
//        for (int i = 0; i < name.length; i++) {
//            if (name[i] != null && id[i] == manageId) {
//                System.out.println("Enter student new test score:");
//                score[i] = input.nextInt();
//            }
//        }
//    }
//    public static void calculate() {
//        for (int i = 0; i < name.length; i++) {
//            if (name[i] != null && grade[i] == ' ') {
//                grade[i] = grade(score[i]);
//            }
//        }
//        System.out.println("Grades calculated.\nGrade Details added.");
//    }
//
//    public static char grade(int score) {
//        if (score >= 90 && score <= 100 ) {
//            return 'A';
//        } else if (score >= 80 && score < 90 ){
//            return 'B';
//        } else if (score >= 70 && score < 80) {
//            return 'C';
//        } else if (score >= 60 && score < 70) {
//            return 'D';
//        } else {
//            return 'F';
//        }
//    }
//
//
//    public static void statistics(){
//        int total = 0;
//        int counter = 0;
//        int number = 0;
//        int highest = 0;
//        int lowest = Integer.MAX_VALUE;
//        for(int i = 0;i<name.length; i++){
//            if(name[i] != null){
//                total += score[i];
//                number++;
//            }
//            if ( score[i] > highest) {
//                highest = score[i];
//            }
//            if(score[i]< lowest){
//                lowest = score[i];
//            }
//            counter++;
//        }
//        if(total>0){
//            int avarage = total /number;
//            System.out.println("Total Students: " + counter + "\nAverage Score :" + avarage+"\nHighest Score"+highest+"\nLowest Score: "+lowest);
//        }else{
//            System.out.println("In your class does npt have student");
//        }
//    }
//    public static void report(){
//        System.out.print("Enter student ID to generate a report:");
//        int inputId = input.nextInt();
//        System.out.println("Generating report for student with ID" + inputId + "Student report");
//        for(int i =0; i< name.length;i++){
//            if( id[i] == inputId){
//                System.out.println("Name: "+ name[i]+ "\nStudent ID: "+id[i]+"\nTest Score: " + score[i]+"\nFinal Grade: "+grade[i]);
//            }
//        }
//
//    }
//    public static void delete(){
//        System.out.println("Enter student ID to delete: ");
//        int deleteId = input.nextInt();
//        for(int i = 0;i< name.length;i++){
//            if(id[i] == deleteId){
//                name[i] = null;
//                id[i] = 0;
//                grade[i] = 0;
//                score[i] = 0;
//            }
//            System.out.println("Student deleted successfully.");
//        }
//    }
//    public static void logOut(){
//        System.out.println("You logged out successfully.");
//    }
//}
