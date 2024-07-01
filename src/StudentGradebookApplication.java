//import java.util.Scanner;
//
//public class StudentGradebookApplication {
//    // Define global variables for user authentication
//    static final String TEACHER_USERNAME = "teacher";
//    static final String TEACHER_PASSWORD = "password";
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Implement user authentication
//        if (authenticateUser(input)) {
//            System.out.println("Authentication successful. Welcome, Teacher!");
//
//            // Example student records
//            Student student1 = new Student("John", 85);
//            Student student2 = new Student("Alice", 92);
//
//            // Display the main menu
//            displayMainMenu();
//
//            int choice;
//            do {
//                System.out.print("Enter your choice: ");
//                choice = input.nextInt();
//                input.nextLine(); // Consume the newline
//
//                switch (choice) {
//                    case 1:
//                        // Add a new student
//                        addStudent(input);
//                        break;
//                    case 2:
//                        // Calculate grades for existing students
//                        calculateGrades(student1, student2);
//                        break;
//                    case 0:
//                        // Exit the application
//                        System.out.println("Exiting the application. Goodbye!");
//                        break;
//                    default:
//                        System.out.println("Invalid choice. Please try again.");
//                }
//                if (choice != 0) {
//                    displayMainMenu();
//                }
//            } while (choice != 0);
//        } else {
//            System.out.println("Authentication failed. Exiting the application.");
//        }
//    }
//
//    public static boolean authenticateUser(Scanner input) {
//        System.out.print("Enter your username: ");
//        String username = input.nextLine();
//        System.out.print("Enter your password: ");
//        String password = input.nextLine();
//
//        return TEACHER_USERNAME.equals(username) && TEACHER_PASSWORD.equals(password);
//    }
//
//    public static void displayMainMenu() {
//        System.out.println("Main Menu:");
//        System.out.println("1. Add a Student");
//        System.out.println("2. Calculate Grades");
//        System.out.println("0. Exit");
//    }
//
//    public static void addStudent(Scanner input) {
//        System.out.print("Enter student's name: ");
//        String name = input.nextLine();
//        System.out.print("Enter student's test score: ");
//        int testScore = input.nextInt();
//        Student newStudent = new Student(name, testScore);
//        System.out.println("Student added: " + newStudent.getName());
//    }
//
//    public static void calculateGrades(Student... students) {
//        for (Student student : students) {
//            int testScore = student.getTestScore();
//            char grade = calculateGrade(testScore);
//            student.setGrade(grade);
//            System.out.println(student.getName() + " scored " + testScore + ", and the grade is " + grade);
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
//    static class Student {
//        private String name;
//        private int testScore;
//        private char grade;
//
//        public Student(String name, int testScore) {
//            this.name = name;
//            this.testScore = testScore;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getTestScore() {
//            return testScore;
//        }
//
//        public char getGrade() {
//            return grade;
//        }
//
//        public void setGrade(char grade) {
//            this.grade = grade;
//        }
//    }
//}
