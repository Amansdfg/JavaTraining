//import java.util.Scanner;
//
//public class Project1GPT {
//    static Student student1;
//    static Student student2;
//    static Student student3;
//    static Student student4;
//    static Student student5;
//    static Student student6;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter username: ");
//        String username = input.nextLine();
//        System.out.print("Enter password: ");
//        String password = input.nextLine();
//
//        if (logIn(username, password)) {
//            System.out.println("Authentication successful!");
//            int choice;
//            mainMenu();
//            do {
//
//                System.out.print("Enter your choice: ");
//                choice = input.nextInt();
//                input.nextLine(); // Consume the newline
//
//                switch (choice) {
//                    case 1:
//                        addStudent(input);
//                        break;
//                    case 2:
//                        editStudent(input);
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
//                        deleteStudent(input);
//                        break;
//                    case 7:
//                        logout();
//                        break;
//                    default:
//                        System.out.println("Enter a number between 1 - 7 (including).");
//                }
//                if (choice != 7) {
//                    mainMenu();
//                }
//            } while (choice != 7);
//        } else {
//            System.out.println("Username or password is incorrect!");
//        }
//    }
//
//    public static boolean logIn(String username, String password) {
//        // Replace "your_username" and "your_password" with the actual username and password
//        return username.equals("your_username") && password.equals("your_password");
//    }
//
//    public static void mainMenu() {
//        System.out.println("Main Menu");
//        System.out.println("1. Add Student");
//        System.out.println("2. Edit Student");
//        System.out.println("3. Calculate Grades");
//        System.out.println("4. View Statistics");
//        System.out.println("5. Generate Reports");
//        System.out.println("6. Delete Student");
//        System.out.println("7. Logout and exit");
//    }
//
//    public static void addStudent(Scanner input) {
//        if (student1 == null) {
//            student1 = createStudent(input);
//        } else if (student2 == null) {
//            student2 = createStudent(input);
//        } else if (student3 == null) {
//            student3 = createStudent(input);
//        } else if (student4 == null) {
//            student4 = createStudent(input);
//        } else if (student5 == null) {
//            student5 = createStudent(input);
//        } else if (student6 == null) {
//            student6 = createStudent(input);
//        } else {
//            System.out.println("Maximum student limit reached. Cannot add more students.");
//        }
//    }
//
//    public static Student createStudent(Scanner input) {
//        System.out.print("Enter student name: ");
//        String name = input.nextLine();
//        System.out.print("Enter student ID: ");
//        int id = input.nextInt();
//        input.nextLine(); // Consume the newline
//        System.out.print("Enter student test score: ");
//        int testScore = input.nextInt();
//        input.nextLine(); // Consume the newline
//
//        return new Student(name, id, testScore);
//    }
//
//    public static void editStudent(Scanner input) {
//        System.out.print("Enter student ID to edit: ");
//        int idToEdit = input.nextInt();
//        input.nextLine(); // Consume the newline
//
//        if (student1 != null && student1.getId() == idToEdit) {
//            System.out.print("Enter new test score: ");
//            int newScore = input.nextInt();
//            input.nextLine(); // Consume the newline
//            student1.setTestScore(newScore);
//            System.out.println("Test score updated for " + student1.getName());
//        } else if (student2 != null && student2.getId() == idToEdit) {
//            System.out.print("Enter new test score: ");
//            int newScore = input.nextInt();
//            input.nextLine(); // Consume the newline
//            student2.setTestScore(newScore);
//            System.out.println("Test score updated for " + student2.getName());
//        } else if (student3!= null && student3.getId() == idToEdit) {
//            System.out.print("Enter new test score: ");
//            int newScore = input.nextInt();
//            input.nextLine(); // Consume the newline
//            student3.setTestScore(newScore);
//            System.out.println("Test score updated for " + student3.getName());
//        } else if (student4 != null && student4.getId() == idToEdit) {
//            System.out.print("Enter new test score: ");
//            int newScore = input.nextInt();
//            input.nextLine(); // Consume the newline
//            student4.setTestScore(newScore);
//            System.out.println("Test score updated for " + student4.getName());
//        } else if (student5 != null && student5.getId() == idToEdit) {
//            System.out.print("Enter new test score: ");
//            int newScore = input.nextInt();
//            input.nextLine(); // Consume the newline
//            student5.setTestScore(newScore);
//            System.out.println("Test score updated for " + student5.getName());
//        } else if (student6 != null && student6.getId() == idToEdit) {
//            System.out.print("Enter new test score: ");
//            int newScore = input.nextInt();
//            input.nextLine(); // Consume the newline
//            student6.setTestScore(newScore);
//            System.out.println("Test score updated for " + student6.getName());
//        } else {
//            System.out.println("Student not found.");
//        }
//    }
//
//    public static void calculateGrades() {
//        if (student1 != null) {
//            student1.setGrade(calculateGrade(student1.getTestScore()));
//            System.out.println(student1.getName() + " scored " + student1.getTestScore() + ", and the grade is " + student1.getGrade());
//        }
//
//        if (student2 != null) {
//            student2.setGrade(calculateGrade(student2.getTestScore()));
//            System.out.println(student2.getName() + " scored " + student2.getTestScore() + ", and the grade is " + student2.getGrade());
//        }
//        if (student3 != null) {
//            student3.setGrade(calculateGrade(student3.getTestScore()));
//            System.out.println(student3.getName() + " scored " + student3.getTestScore() + ", and the grade is " + student3.getGrade());
//        }
//        if (student4 != null) {
//            student4.setGrade(calculateGrade(student4.getTestScore()));
//            System.out.println(student4.getName() + " scored " + student4.getTestScore() + ", and the grade is " + student4.getGrade());
//        }
//        if (student5 != null) {
//            student5.setGrade(calculateGrade(student5.getTestScore()));
//            System.out.println(student5.getName() + " scored " + student5.getTestScore() + ", and the grade is " + student5.getGrade());
//        }
//        if (student6 != null) {
//            student6.setGrade(calculateGrade(student6.getTestScore()));
//            System.out.println(student6.getName() + " scored " + student6.getTestScore() + ", and the grade is " + student6.getGrade());
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
//        if (student1 != null) {
//            totalTestScore += student1.getTestScore();
//            numberOfStudents++;
//            if (student1.getTestScore() > highestScore) {
//                highestScore = student1.getTestScore();
//            }
//            if (student1.getTestScore() < lowestScore) {
//                lowestScore = student1.getTestScore();
//            }
//        }
//
//        if (student2 != null) {
//            totalTestScore += student2.getTestScore();
//            numberOfStudents++;
//            if (student2.getTestScore() > highestScore) {
//                highestScore = student2.getTestScore();
//            }
//            if (student2.getTestScore() < lowestScore) {
//                lowestScore = student2.getTestScore();
//            }
//        }
//
//        if (numberOfStudents > 0) {
//            int averageTestScore = totalTestScore / numberOfStudents;
//            System.out.println("Statistics:");
//            System.out.println("Class Average Score: " + averageTestScore);
//            System.out.println("Highest Score: " + highestScore);
//            System.out.println("Lowest Score: " + lowestScore);
//        } else {
//            System.out.println("No students in the class.");
//        }
//    }
//
//    public static void generateReports() {
//        if (student1 != null) {
//            System.out.println("Student Name: " + student1.getName());
//            System.out.println("Student ID: " + student1.getId());
//            System.out.println("Test Score: " + student1.getTestScore());
//            System.out.println("Grade: " + student1.getGrade());
//        }
//
//        if (student2 != null) {
//            System.out.println("Student Name: " + student2.getName());
//            System.out.println("Student ID: " + student2.getId());
//            System.out.println("Test Score: " + student2.getTestScore());
//            System.out.println("Grade: " + student2.getGrade());
//        }
//        if (student3 != null) {
//            System.out.println("Student Name: " + student3.getName());
//            System.out.println("Student ID: " + student3.getId());
//            System.out.println("Test Score: " + student3.getTestScore());
//            System.out.println("Grade: " + student3.getGrade());
//        }
//        if (student4 != null) {
//            System.out.println("Student Name: " + student4.getName());
//            System.out.println("Student ID: " + student4.getId());
//            System.out.println("Test Score: " + student4.getTestScore());
//            System.out.println("Grade: " + student4.getGrade());
//        }
//        if (student5 != null) {
//            System.out.println("Student Name: " + student5.getName());
//            System.out.println("Student ID: " + student5.getId());
//            System.out.println("Test Score: " + student5.getTestScore());
//            System.out.println("Grade: " + student5.getGrade());
//        }
//        if (student6 != null) {
//            System.out.println("Student Name: " + student6.getName());
//            System.out.println("Student ID: " + student6.getId());
//            System.out.println("Test Score: " + student6.getTestScore());
//            System.out.println("Grade: " + student6.getGrade());
//        }
//    }
//
//    public static void deleteStudent(Scanner input) {
//        System.out.print("Enter student id to delete: ");
//        int idToDelete = input.nextInt();
//        input.nextLine();
//
//        if (student1 != null && student1.getId() == idToDelete) {
//            student1 = null;
//            System.out.println("Student " + idToDelete + " has been deleted.");
//        } else if (student2 != null && student2.getId() == idToDelete) {
//            student2 = null;
//            System.out.println("Student " + idToDelete + " has been deleted.");
//        } else {
//            System.out.println("Student not found.");
//        }
//    }
//
//    public static void logout() {
//        System.out.println("You are successfully logged out.");
//    }
//
//    static class Student {
//        private String name;
//        private int testScore;
//        private char grade;
//        private int id;
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
//        public char getGrade() {
//            return grade;
//        }
//
//        public void setTestScore(int testScore) {
//            this.testScore = testScore;
//        }
//
//        public void setGrade(char grade) {
//            this.grade = grade;
//        }
//    }
//}