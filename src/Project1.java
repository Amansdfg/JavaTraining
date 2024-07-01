//import java.util.Scanner;
//public class Project1 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter username: ");
//        String username = input.nextLine();
//        System.out.print("Enter password: ");
//        String password = input.nextLine();
//        if(username.equals("your_username") && password.equals("your_password")){
//            System.out.println("Authentication successful!");
//            mainMenu();
//            int choice ;
//            do{
//                System.out.print("Enter your choice:");
//                choice = input.nextInt();
//                input.nextLine();
//                switch (choice) {
//                    case 1:
//                        student(input);
//                        break;
//                    case 2:
//                        records(id);
//                        break;
//                    case 3:
//                        grades(students);
//                        break;
//                    case 4:
//                        statistics(testScore);
//                        break;
//                    case 5:
//                        reports();
//                        break;
//                    case 6:
//                        delete(input);
//                        break;
//                    case 0:
//                        logout();
//                        break;
//                    default:
//                        System.out.println("Enter a number between 1 -7(including)");
//                }
//                if (choice != 0) {
//                    mainMenu();
//                }
//            }while(choice !=0);
//        }else{
//            System.out.println("Username or password is incorrect!");
//        }
//    }
//    public static void mainMenu(){
//        System.out.println("Main Menu");
//        System.out.println("1. Add Student");
//        System.out.println("2. Manage records");
//        System.out.println("3. Calculate Grades");
//        System.out.println("4. View Statistics");
//        System.out.println("5. Generate Reports");
//        System.out.println("6. Delete student");
//        System.out.println("7. Logout and exit");
//    }
//    public static void student(Scanner input) {
//        System.out.print("Enter student name: ");
//        String name = input.nextLine();
//        System.out.print("Enter student ID: ");
//        int id = input.nextInt();
//        System.out.print("Enter student test score: ");
//        int testScore = input.nextInt();
//        Project1.Student newStudent = new Project1.Student(name,id, testScore);
//        System.out.println("Student added successfully. ");
//    }
//    public static void  records(int id,int newScore){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter student ID to edit: ");
//        id = input.nextInt();
//        System.out.println("Enter new test score: ");
//        newScore = input.nextInt();
//    }
//    public static void statistics(int testScore){
//        int average = testScore ;
//        int highest = testScore;
//        int lowest = testScore;
//        System.out.println("Statistics: ");
//        System.out.println("The average score is" + average);
//        System.out.println("The highest score is" + highest);
//        System.out.println("The lowest score is "+ lowest);
//    }
//    public static void grades(Student... students) {
//        for (Student student : students) {
//            int testScore = student.getTestScore();
//            char grade = calculate(testScore);
//            student.setGrade(grade);
//            System.out.println(student.getName() + " scored " + testScore + ", and the grade is " + grade);
//        }
//    }
//    public static char calculate(int testScore) {
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
//    public static void delete(Scanner input) {
//        System.out.print("Enter student id to delete: ");
//        String idToDelete = input.nextLine();
//
//        if ((Student != null) && Student.getId().equalsIgnoreCase(idToDelete)) {
//            Student = null;
//            System.out.println("Student " + idToDelete + " has been deleted.");
//        } else {
//            System.out.println("Student not found.");
//        }
//    }
//    public static  void logout(){
//        System.out.println("You are successfully logged out");
//    }
//    static class Student {
//        private String name;
//        private int testScore;
//        private char grade;
//        private int id;
//        public Student(String name, int testScore,int id) {
//            this.name = name;
//            this.testScore = testScore;
//            this.id = id;
//        }
//        public String getName() {
//            return name;
//        }
//        public int getTestScore() {
//            return testScore;
//        }
//        public char getGrade() {
//            return grade;
//        }
//        public int getId(){
//            return id;
//        }
//        public void setGrade(char grade) {
//            this.grade = grade;
//        }
//    }
//}
