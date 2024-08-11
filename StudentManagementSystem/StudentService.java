package studentmanagement;

import java.util.List;

public class StudentService {
    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }

    public void addStudent(int id, String name, int age, double grade) {
        Student student = new Student(id, name, age, grade);
        studentDAO.addStudent(student);
    }

    public void displayAllStudents() {
        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
