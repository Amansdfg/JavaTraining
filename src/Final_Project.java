import java.util.Scanner;
public class Final_Project {
    public static Scanner input = new Scanner(System.in);
    public static String[] name = new String[30];
    public static int[] id = new int[30];
    public static int[] score = new int[30];
    public static char[] grade = new char[30];

    public static void main(String[] args) {
        if (LogIn()) {
            int option;
            do{
                mainManu();
                System.out.print("Enter your choice: ");
                option = input.nextInt();
                switch (option) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        manageRecords();
                        break;
                    case 3:
                        calculateGrades();
                        break;
                    case 4:
                        viewStatistics();
                        break;
                    case 5:
                        generateReports();
                        break;
                    case 6:
                        deleteStudent();
                        break;
                    case 7:
                        logOutAndExit();
                        break;
                    default:
                        System.out.println("Enter number between 1 - 7 (including).");
                }
            }while(option!=7);
        }
    }

    public static boolean LogIn() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        while (!username.equals("Aman") || !password.equals("Aman")) {
            System.out.println("username or password is incorrect \nplease try again.");
            System.out.print("Enter username: ");
            username = input.nextLine();
            System.out.print("Enter password: ");
            password = input.nextLine();
        }
        return true;
    }

    public static void mainManu() {
        System.out.println("Main manu \n1. Add Student \n2. Manage Records \n3. Calculate Grades \n4. View Statistics \n5. Generate Reports \n6. Delete Student \n7. Logout and exit");
    }

    public static void addStudent() {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                System.out.print("Enter student name: ");
                input.nextLine();
                name[i] = input.nextLine();
                System.out.print("Enter student ID: ");
                id[i] = input.nextInt();
                System.out.print("Enter test score: ");
                score[i] = input.nextInt();
                while (score[i] > 100 || score[i] < 0) {
                    System.out.println("Enter student test score 0-100!!!");
                    System.out.print("Enter test score: ");
                    score[i] = input.nextInt();
                }
                System.out.println("Student added successfully");
                return;
            }
        }
    }

    public static void manageRecords() {
        System.out.print("Enter student ID to edit: ");
        int idForManage = input.nextInt();
        for (int i = 0; i < name.length; i++) {
            if (id[i] == idForManage) {
                System.out.print("Enter new test score: ");
                score[i] = input.nextInt();
                System.out.println("Student record updated successfully.");
                return;
            }
        }
        System.out.println("This id is already hava in class");
    }

    public static void calculateGrades() {
        for (int i = 0; i < id.length; i++) {
            if (id[i] != 0 && name[i] != null && grade[i] != ' ') {
                grade[i] = assessment(score[i]);
            }
        }
        System.out.println("Grades calculated.\nGrades Details added.");
    }

    public static char assessment(int score) {
        char ch ;
        if (score >= 90) {
            ch= '\u0041';
        } else if (score >= 80) {
            ch = '\u0042';
        } else if (score >= 70) {
            ch = '\u0043';
        } else if (score >= 60) {
            ch ='\u0044';
        } else {
            ch ='\u0046';
        }
        return ch;
    }

    public static void viewStatistics() {
        int totalStudents = 0;
        double averageScore;
        double totalScore = 0;
        double highestScore = 0;
        double lowestScore = 101;
        for (int i = 0; i < id.length; i++) {
            if (name[i] != null && id[i] != 0 ) {
                if (score[i] > highestScore) highestScore = score[i];
                if (score[i] < lowestScore) lowestScore = score[i];
                totalScore += score[i];
                totalStudents++;
            }
        }
        if (totalStudents > 0) {
            averageScore = totalScore / totalStudents;
            System.out.println("Total Students: " + totalStudents + "\nAverage Score: " + (Math.round(averageScore * 100) / 100.0) + "\nHighest Score: " + highestScore + "\nLowest Score: " + lowestScore);
        } else {
            System.out.println("No Students in the class.");
        }

    }

    public static void generateReports() {
        System.out.print("Enter student ID to generate a report: ");
        int idForGenerateReports = input.nextInt();
        System.out.println("Generating report for student with ID: " + idForGenerateReports);
        for (int i = 0; i < id.length; i++) {
            if (id[i] == idForGenerateReports && name[i] != null && id[i] != 0) {
                System.out.println("System Report \nName: " + name[i] + "\n" + "Student ID: " + id[i] + "\n" + "Test Score: " + score[i] + "\n" + "Final Grade: " + grade[i]);
                return;
            }
        }
        System.out.println("No Student with ID: " + idForGenerateReports);
    }

    public static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int idForDeleteStudent = input.nextInt();
        for (int i = 0; i < id.length; i++) {
            if (name[i] != null && id[i] == idForDeleteStudent) {
                name[i] = null;
                id[i] = 0;
                score[i] = 0;
                grade[i] = ' ';
                System.out.println("Student deleted successfully");
                return;
            }
        }
        System.out.println("No Student with ID: " + idForDeleteStudent);
    }

    public static void logOutAndExit() {
        System.out.println("successfully logged out!");
        System.exit(0);
    }
}