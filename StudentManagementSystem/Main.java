package studentmanagement;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Menu menu = new Menu();


        while (true) {
            menu.displayMenu();
            int choice = menu.getUserChoice();

            switch (choice) {
                case 1:
                    int id = menu.getIntInput("Enter student ID: ");
                    String name = menu.getStringInput("Enter student name: ");
                    int age = menu.getIntInput("Enter student age: ");
                    double grade = menu.getDoubleInput("Enter student grade: ");
                    studentService.addStudent(id, name, age, grade);
                    break;
                case 2:
                    studentService.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
