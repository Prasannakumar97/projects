package studentmanagement;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public String getStringInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public int getIntInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public double getDoubleInput(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}
