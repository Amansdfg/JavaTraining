//import java.util.Scanner;
//
//public class NewAman {
//    static String[] studentNames = new String[100];
//    static int[] studentIDs = new int[100];
//    static int[] studentTestScores = new int[100];
//    static char[] studentGrades = new char[100];
//
//    static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        if (logIn()) {
//            System.out.println("Authentication successful!");
//            int choice;
//            do {
//                mainMenu();
//                System.out.print("Enter your choice: ");
//                choice = input.nextInt();
//                input.nextLine();
//
//                switch (choice) {
//                    case 1:
//                        addStudent();
//                        break;
//                    case 2:
//                        editStudent();
//                        break;
//                    case 3:
//                        calculateGrades();
//                        break;
//                    case 4:
//                        viewStatistics();
//                        break;
//                    case 5:
//                        generateReports();
//                        break;
//                    case 6:
//                        deleteStudent();
//                        break;
//                    case 7:
//                        logout();
//                        break;
//                    default:
//                        System.out.println("Enter a number between 1 - 7 (including).");
//                }
//            } while (choice != 7);
//        } else {
//            System.out.println("Username or password is incorrect!");
//        }
//    }
//
//    public static boolean logIn() {
//        System.out.print("Enter username: ");
//        String username = input.nextLine();
//        System.out.print("Enter password: ");
//        String password = input.nextLine();
//        // Replace "your_username" and "your_password" with the actual username and password
//        return username.equals("your_username") && password.equals("your_password");
//    }
//
//    public static void mainMenu() {
//        System.out.println("Main Menu\n1. Add Student\n2. Edit Student\n3. Calculate Grades\n4. View Statistics\n5. Generate Reports\n6. Delete Student\n7. Logout and exit");
//    }
//
//    public static void addStudent() {
//        for (int i = 0; i < studentNames.length; i++) {
//            if (studentNames[i] == null) {
//                System.out.print("Enter student name: ");
//                studentNames[i] = input.nextLine();
//                System.out.print("Enter student ID: ");
//                studentIDs[i] = input.nextInt();
//                input.nextLine();
//                System.out.print("Enter student test score: ");
//                studentTestScores[i] = input.nextInt();
//                input.nextLine();
//                studentGrades[i] = ' '; // Initialize grade to a space
//                System.out.println("Student added successfully.");
//                return;
//            }
//        }
//        System.out.println("Maximum student limit reached. Cannot add more students.");
//    }
//
//    public static void editStudent() {
//        System.out.print("Enter student ID to edit: ");
//        int idToEdit = input.nextInt();
//        input.nextLine();
//
//        for (int i = 0; i < studentNames.length; i++) {
//            if (studentNames[i] != null && studentIDs[i] == idToEdit) {
//                System.out.print("Enter new test score: ");
//                studentTestScores[i] = input.nextInt();
//                input.nextLine();
//                studentGrades[i] = ' '; // Reset grade to be recalculated
//                System.out.println("Test score updated for " + studentNames[i]);
//                return;
//            }
//        }
//        System.out.println("Student not found.");
//    }
//
//    public static void calculateGrades() {
//        for (int i = 0; i < studentNames.length; i++) {
//            if (studentNames[i] != null && studentGrades[i] == ' ') {
//                studentGrades[i] = calculateGrade(studentTestScores[i]);
//                System.out.println(studentNames[i] + " scored " + studentTestScores[i] + ", and the grade is " + studentGrades[i]);
//            }
//        }
//    }
//
//    public static char calculateGrade(int testScore) {
//        if (testScore >= 90) {
//            return 'A';
//        } else if (testScore >= 80) {
//            return 'B';
//        } else if (testScore >= 70) {
//            return 'C';
//        } else if (testScore >= 60) {
//            return 'D';
//        } else {
//            return 'F';
//        }
//    }
//
//    public static void viewStatistics() {
//        int totalTestScore = 0;
//        int numberOfStudents = 0;
//        int highestScore = 0;
//        int lowestScore = Integer.MAX_VALUE;
//
//        for (int i = 0; i < studentNames.length; i++) {
//            if (studentNames[i] != null) {
//                totalTestScore += studentTestScores[i];
//                numberOfStudents++;
//                if (studentTestScores[i] > highestScore) {
//                    highestScore = studentTestScores[i];
//                }
//                if (studentTestScores[i] < lowestScore) {
//                    lowestScore = studentTestScores[i];
//                }
//            }
//        }
//
//        if (numberOfStudents > 0) {
//            int averageTestScore = totalTestScore / numberOfStudents;
//            System.out.println("Statistics:\nClass Average Score: " + averageTestScore + "\nHighest Score: " + highestScore + "\nLowest Score: " + lowestScore);
//        } else {
//            System.out.println("No students in the class.");
//        }
//    }
//
//    public static void generateReports() {
//        for (int i = 0; i < studentNames.length; i++) {
//            if (studentNames[i] != null) {
//                System.out.println("Student Name: " + studentNames[i] + "\nStudent ID: " + studentIDs[i] + "\nTest Score: " + studentTestScores[i] + "\nGrade: " + studentGrades[i]);
//            }
//        }
//    }
//
//    public static void deleteStudent() {
//        System.out.print("Enter student id to delete: ");
//        int idToDelete = input.nextInt();
//        input.nextLine();
//
//        for (int i = 0; i < studentNames.length; i++) {
//            if (studentNames[i] != null && studentIDs[i] == idToDelete) {
//                studentNames[i] = null;
//                studentIDs[i] = 0;
//                studentTestScores[i] = 0;
//                studentGrades[i] = ' ';
//                System.out.println("Student " + idToDelete + " has been deleted.");
//                return;
//            }
//        }
//        System.out.println("Student not found.");
//    }
//
//    public static void logout() {
//        System.out.println("You are successfully logged out.");
//    }
//}
