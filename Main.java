import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        RoomManager roomManager = new RoomManager();
        PaymentManager paymentManager = new PaymentManager();
        ComplaintManager complaintManager = new ComplaintManager();

        ReportsManager reportsManager = new ReportsManager(
                roomManager,
                paymentManager,
                complaintManager
        );

        while (true) {

            System.out.println("\n=================================");
            System.out.println("      HOSTEL MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Student Management");
            System.out.println("2. Room Management");
            System.out.println("3. Payment Management");
            System.out.println("4. Complaint Management");
            System.out.println("5. Reports");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {

                // STUDENT MANAGEMENT
                case 1:

                    while (true) {

                        System.out.println("\n===== STUDENT MANAGEMENT =====");
                        System.out.println("1. Add Student");
                        System.out.println("2. Update Student");
                        System.out.println("3. Delete Student");
                        System.out.println("4. View Students");
                        System.out.println("5. Search Student");
                        System.out.println("6. Back");
                        System.out.print("Enter your choice: ");

                        int choice = sc.nextInt();
                        sc.nextLine();

                        if (choice == 1) {

                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();

                            System.out.print("Enter Student Name: ");
                            sc.nextLine();
                            String name = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = sc.nextInt();

                            System.out.print("Enter Course: ");
                            sc.nextLine();
                            String course = sc.nextLine();

                            System.out.print("Enter Room Number: ");
                            int roomNumber = sc.nextInt();

                            Student student = new Student(
                                    id,
                                    name,
                                    age,
                                    course,
                                    roomNumber
                            );

                            studentManager.addStudent(student);

                        } else if (choice == 2) {

                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();

                            System.out.print("Enter New Name: ");
                            sc.nextLine();
                            String name = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            int age = sc.nextInt();

                            System.out.print("Enter New Course: ");
                            sc.nextLine();
                            String course = sc.nextLine();

                            System.out.print("Enter New Room Number: ");
                            int roomNumber = sc.nextInt();

                            studentManager.updateStudent(
                                    id,
                                    name,
                                    age,
                                    course,
                                    roomNumber
                            );

                        } else if (choice == 3) {

                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();

                            studentManager.deleteStudent(id);

                        } else if (choice == 4) {

                            studentManager.viewStudents();

                        } else if (choice == 5) {

                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();

                            studentManager.searchStudent(id);

                        } else if (choice == 6) {

                            break;

                        } else {

                            System.out.println("Invalid choice!");
                        }
                    }

                    break;


                // ROOM MANAGEMENT
                case 2:

                    while (true) {

                        System.out.println("\n===== ROOM MANAGEMENT =====");
                        System.out.println("1. Add Room");
                        System.out.println("2. View Rooms");
                        System.out.println("3. Search Room");
                        System.out.println("4. Allocate Room");
                        System.out.println("5. Vacate Room");
                        System.out.println("6. Back");
                        System.out.print("Enter your choice: ");

                        int choice = sc.nextInt();

                        if (choice == 1) {

                            System.out.print("Enter Room Number: ");
                            int roomNumber = sc.nextInt();

                            System.out.print("Enter Room Capacity: ");
                            int capacity = sc.nextInt();

                            Room room = new Room(roomNumber, capacity);
                            roomManager.addRoom(room);

                        } else if (choice == 2) {

                            roomManager.viewRooms();

                        } else if (choice == 3) {

                            System.out.print("Enter Room Number: ");
                            int roomNumber = sc.nextInt();

                            roomManager.searchRoom(roomNumber);

                        } else if (choice == 4) {

                            System.out.print("Enter Room Number: ");
                            int roomNumber = sc.nextInt();

                            roomManager.allocateRoom(roomNumber);

                        } else if (choice == 5) {

                            System.out.print("Enter Room Number: ");
                            int roomNumber = sc.nextInt();

                            roomManager.vacateRoom(roomNumber);

                        } else if (choice == 6) {

                            break;

                        } else {

                            System.out.println("Invalid choice!");
                        }
                    }

                    break;


                // PAYMENT MANAGEMENT
                case 3:

                    while (true) {

                        System.out.println("\n===== PAYMENT MANAGEMENT =====");
                        System.out.println("1. Record Payment");
                        System.out.println("2. Payment History");
                        System.out.println("3. Search Payment");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice: ");

                        int choice = sc.nextInt();

                        if (choice == 1) {

                            System.out.print("Enter Student ID: ");
                            int studentId = sc.nextInt();

                            System.out.print("Enter Payment Amount: ");
                            double amount = sc.nextDouble();

                            sc.nextLine();

                            System.out.print("Enter Payment Date: ");
                            String date = sc.nextLine();

                            System.out.print("Enter Payment Mode: ");
                            String mode = sc.nextLine();

                            Payment payment = new Payment(
                                    studentId,
                                    amount,
                                    date,
                                    mode
                            );

                            paymentManager.recordPayment(payment);

                        } else if (choice == 2) {

                            paymentManager.viewPaymentHistory();

                        } else if (choice == 3) {

                            System.out.print("Enter Student ID: ");
                            int studentId = sc.nextInt();

                            paymentManager.searchPayment(studentId);

                        } else if (choice == 4) {

                            break;

                        } else {

                            System.out.println("Invalid choice!");
                        }
                    }

                    break;


                // COMPLAINT MANAGEMENT
                case 4:

                    while (true) {

                        System.out.println("\n===== COMPLAINT MANAGEMENT =====");
                        System.out.println("1. Submit Complaint");
                        System.out.println("2. View Complaints");
                        System.out.println("3. Search Complaint");
                        System.out.println("4. Resolve Complaint");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        int choice = sc.nextInt();
                        sc.nextLine();

                        if (choice == 1) {

                            System.out.print("Enter Student ID: ");
                            int studentId = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Complaint: ");
                            String text = sc.nextLine();

                            System.out.print("Enter Complaint Date: ");
                            String date = sc.nextLine();

                            Complaint complaint = new Complaint(
                                    studentId,
                                    text,
                                    date
                            );

                            complaintManager.submitComplaint(complaint);

                        } else if (choice == 2) {

                            complaintManager.viewComplaints();

                        } else if (choice == 3) {

                            System.out.print("Enter Student ID: ");
                            int studentId = sc.nextInt();

                            complaintManager.searchComplaint(studentId);

                        } else if (choice == 4) {

                            System.out.print("Enter Student ID: ");
                            int studentId = sc.nextInt();

                            complaintManager.resolveComplaint(studentId);

                        } else if (choice == 5) {

                            break;

                        } else {

                            System.out.println("Invalid choice!");
                        }
                    }

                    break;


                // REPORTS
                case 5:

                    while (true) {

                        System.out.println("\n===== REPORTS =====");
                        System.out.println("1. Occupancy Report");
                        System.out.println("2. Payment Report");
                        System.out.println("3. Complaint Report");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice: ");

                        int choice = sc.nextInt();

                        if (choice == 1) {

                            reportsManager.occupancyReport();

                        } else if (choice == 2) {

                            reportsManager.paymentReport();

                        } else if (choice == 3) {

                            reportsManager.complaintReport();

                        } else if (choice == 4) {

                            break;

                        } else {

                            System.out.println("Invalid choice!");
                        }
                    }

                    break;


                // EXIT
                case 6:

                    System.out.println(
                            "\nThank you for using Hostel Management System!"
                    );

                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}