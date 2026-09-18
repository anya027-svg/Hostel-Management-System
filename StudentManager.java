import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {

        // Check duplicate ID
        for (Student s : students) {

            if (s.getId() == student.getId()) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== ALL STUDENTS =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Search student
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update student
    public void updateStudent(
            int id,
            String name,
            int age,
            String course,
            int roomNumber) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                student.setRoomNumber(roomNumber);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete student
    public void deleteStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}