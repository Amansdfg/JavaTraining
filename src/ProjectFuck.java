//import java.util.Scanner;
//
//public class ProjectFuck {
//    public static Student[] students = new Student[100000];
//    static Scanner input = new Scanner(System.in);
//    public static void main(String[] args) {
//        if (logIn()) {
//            System.out.println("Authentication successful!");
//            int choice;
//            do{
//                mainMenu();
//                System.out.print("Enter your choice: ");
//                choice = input.nextInt();
//                input.nextLine();
//                switch (choice) {
//                    case 1:
//                        add();
//                        break;
//                    case 2:
//                        edit();
//                        break;
//                    case 3:
//                        calculate();
//                        break;
//                    case 4:
//                        statistics();
//                        break;
//                    case 5:
//                        reports();
//                        break;
//                    case 6:
//                        delete();
//                        break;
//                    case 0:
//                        logout();
//                        break;
//                    default:
//                        System.out.println("Enter a number between 1 - 7 (including).");
//                }
//            } while (choice != 0);
//        }
//    }
//    public static boolean logIn() {
//        while(true) {
//            System.out.print("Enter username: ");
//            String username = input.nextLine();
//            System.out.print("Enter password: ");
//            String password = input.nextLine();
//            if((username.equals("Aman")) && (password.equals("Aman"))){
//                break;
//            }else{
//                System.out.println("Incorrect username or password");
//            }
//        }
//        return true;
//
//    }
//
//    public static void mainMenu() {
//        System.out.println("Main Menu\n1. Add Student\n2. Edit Student\n3. Calculate Grades\n4. View Statistics\n5. Generate Reports\n6. Delete Student\n0. Logout and exit");
//    }
//
//    public static void add() {
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == null) {
//                System.out.print("Enter student name: ");
//                String name = input.nextLine();
//                System.out.print("Enter student ID: ");
//                int id = input.nextInt();
//
//                System.out.print("Enter student test score: ");
//                int testScore = input.nextInt();
//
//                students[i] = new Student(name, id, testScore);
//                System.out.println("Student record added successfully.");
//                return;
//            }
//        }
//        System.out.println("Maximum student limit reached. Cannot add more students.");
//    }
//    public static void edit() {
//        System.out.print("Enter student ID to edit: ");
//        int idToEdit = input.nextInt();
//        input.nextLine();
//
//        for (Student student : students) {
//            if (student != null && student.getId() == idToEdit) {
//                System.out.print("Enter new test score: ");
//                int newScore = input.nextInt();
//                input.nextLine();
//                student.setTestScore(newScore);
//                System.out.println("Test score updated for " + student.getName());
//                return;
//            }
//        }
//        System.out.println("Student not found.");
//    }
//    public static void calculate(){
//        double totalTestScore = 0;
//        double numberOfStudents = 0;
//        double highestScore = 0;
//        double lowestScore = Integer.MAX_VALUE;
//
//        for (Student student : students) {
//            if (student != null) {
//                totalTestScore += student.getTestScore();
//                numberOfStudents++;
//                if (student.getTestScore() > highestScore) {
//                    highestScore = student.getTestScore();
//                }
//                if (student.getTestScore() < lowestScore) {
//                    lowestScore = student.getTestScore();
//                }
//            }
//        }
//
//        System.out.println("Grades calculated\nGrade Details added");
//
//    }
//
//
//    public static void statistics() {
////        if ( calculate.numberOfStudents() > 0) {
////            double averageTestScore =  totalTestScore / numberOfStudents;
////            System.out.println("Statistics:\nClass Average Score: " + averageTestScore + "\nHighest Score: " +  highestScore + "\nLowest Score: " + lowestScore);
////        } else {
////            System.out.println("No students in the class.");
////        }
//    }
//
//    public static void reports() {
//        for (Student student : students) {
//            if (student != null) {
//                System.out.println("Student Name: " + student.getName() + "\nStudent ID: " + student.getId() + "\nTest Score: " + student.getTestScore());
//            }
//        }
//    }
//
//    public static void delete() {
//        System.out.print("Enter student id to delete: ");
//        int id = input.nextInt();
//        input.nextLine();
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null && students[i].getId() == id) {
//                students[i] = null;
//                System.out.println("Student " + id + " has been deleted.");
//                return;
//            }
//        }
//        System.out.println("Student not found.");
//    }
//
//    public static void logout() {
//        System.out.println("You are successfully logged out.");
//    }
//
//    public static  class Student {
//        private final String name;
//        private int testScore;
//        private final int id;
//
//
//        public Student(String name, int id, int testScore) {
//            this.name = name;
//            this.id = id;
//            this.testScore = testScore;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public int getTestScore() {
//            return testScore;
//        }
//
//
//        public void setTestScore(int testScore) {
//            this.testScore = testScore;
//        }
//
//    }
//}
