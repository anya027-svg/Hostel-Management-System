public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private int roomNumber;

    public Student(int id, String name, int age, String course, int roomNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.roomNumber = roomNumber;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Display student details

    public void displayStudent() {

        System.out.println("----------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("Room Number  : " + roomNumber);
        System.out.println("----------------------------");
    }
}