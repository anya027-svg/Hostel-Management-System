# 🏨 Hostel Management System

## 📌 Project Overview

The **Hostel Management System** is a Java-based console application designed to simplify and organize common hostel management activities.

The system provides separate modules for managing **students, rooms, payments, complaints, and reports**. It uses a menu-driven interface that allows the user to perform different operations through the terminal.

This project was developed to demonstrate the practical implementation of **Object-Oriented Programming (OOP)** concepts and Java programming fundamentals in a real-world application.

The application currently uses **in-memory data storage with ArrayList**, so the data remains available while the program is running. Data is not permanently stored after the program is closed.

---

# 🎯 Objectives

The main objectives of the Hostel Management System are:

* To maintain student information in an organized manner.
* To provide an easy way to add, update, delete, view, and search student records.
* To manage hostel rooms and monitor their occupancy.
* To allocate available rooms and vacate occupied rooms.
* To maintain student payment records.
* To allow students to submit and track complaints.
* To resolve hostel complaints and maintain their status.
* To generate basic reports related to rooms, payments, and complaints.
* To demonstrate modular programming using multiple Java classes.
* To apply Object-Oriented Programming concepts to a practical problem.

---

# ✨ Features

## 1. 👨‍🎓 Student Management

The Student Management module handles student-related information.

### Operations:

* Add a new student
* View all students
* Search for a student using Student ID
* Update student details
* Delete a student record

### Student Information:

Each student record contains:

* Student ID
* Student Name
* Age
* Course
* Room Number

---

## 2. 🏠 Room Management

The Room Management module is used to manage hostel rooms and their occupancy.

### Operations:

* Add a new room
* View all rooms
* Search for a room
* Allocate a room
* Vacate a room

### Room Information:

Each room contains:

* Room Number
* Room Capacity
* Number of Occupied Beds
* Number of Available Beds
* Room Status

The system automatically determines whether a room is **Available** or **Full** based on its occupancy.

---

## 3. 💳 Payment Management

The Payment Management module maintains records of hostel payments.

### Operations:

* Record a payment
* View payment history
* Search payment records using Student ID

### Payment Information:

Each payment contains:

* Student ID
* Payment Amount
* Payment Date
* Payment Mode

Examples of payment modes include:

* UPI
* Cash
* Card
* Bank Transfer

---

## 4. 📝 Complaint Management

The Complaint Management module allows hostel complaints to be recorded and managed.

### Operations:

* Submit a complaint
* View all complaints
* Search complaints using Student ID
* Resolve complaints

### Complaint Information:

Each complaint contains:

* Student ID
* Complaint Description
* Complaint Date
* Complaint Status

A newly submitted complaint is automatically assigned the status:

```text
Pending
```

After resolving the complaint, its status changes to:

```text
Resolved
```

---

## 5. 📊 Reports

The Reports module provides a simple overview of the information managed by the system.

### Available Reports:

* Occupancy Report
* Payment Report
* Complaint Report

The reports use the existing management modules to display the corresponding records.

---

# 🏗️ Project Architecture

The project is divided into separate classes according to their responsibilities.

```text
                    ┌──────────────────────┐
                    │       Main.java      │
                    │   User Interface     │
                    └──────────┬───────────┘
                               │
          ┌────────────────────┼────────────────────┐
          │                    │                    │
          ▼                    ▼                    ▼
 ┌─────────────────┐  ┌─────────────────┐  ┌─────────────────┐
 │ StudentManager  │  │  RoomManager    │  │ PaymentManager  │
 └────────┬────────┘  └────────┬────────┘  └────────┬────────┘
          │                    │                    │
          ▼                    ▼                    ▼
 ┌─────────────────┐  ┌─────────────────┐  ┌─────────────────┐
 │   Student.java  │  │    Room.java    │  │   Payment.java  │
 └─────────────────┘  └─────────────────┘  └─────────────────┘

                               │
                               ▼
                     ┌─────────────────────┐
                     │ ComplaintManager    │
                     └──────────┬──────────┘
                                │
                                ▼
                       ┌─────────────────┐
                       │ Complaint.java  │
                       └─────────────────┘

                                │
                                ▼
                     ┌─────────────────────┐
                     │  ReportsManager    │
                     └──────────┬──────────┘
                                │
                  ┌─────────────┼─────────────┐
                  ▼             ▼             ▼
               Rooms         Payments      Complaints
```

---

# 📂 File Structure

```text
HostelManagementSystem/
│
├── Main.java
│
├── Student.java
├── StudentManager.java
│
├── Room.java
├── RoomManager.java
│
├── Payment.java
├── PaymentManager.java
│
├── Complaint.java
├── ComplaintManager.java
│
├── Reports.java
└── ReportsManager.java
```

---

# 📄 Class Description

| File                    | Purpose                                                 |
| ----------------------- | ------------------------------------------------------- |
| `Main.java`             | Contains the main method and menu-driven user interface |
| `Student.java`          | Represents a student and stores student information     |
| `StudentManager.java`   | Performs student management operations                  |
| `Room.java`             | Represents a hostel room and its occupancy              |
| `RoomManager.java`      | Performs room management operations                     |
| `Payment.java`          | Represents a student payment record                     |
| `PaymentManager.java`   | Manages payment records                                 |
| `Complaint.java`        | Represents a hostel complaint                           |
| `ComplaintManager.java` | Manages and resolves complaints                         |
| `Reports.java`          | Represents report information                           |
| `ReportsManager.java`   | Generates/display basic hostel reports                  |

---

# 🧠 OOP Concepts Used

The project demonstrates several important Object-Oriented Programming concepts.

## 1. Encapsulation

The data members of classes are declared as `private`.

For example:

```java
private int id;
private String name;
private int age;
private String course;
private int roomNumber;
```

Access to these variables is provided through getter and setter methods.

This protects the internal data of objects from direct modification.

---

## 2. Classes and Objects

Each real-world entity is represented using a Java class.

Examples:

```text
Student
Room
Payment
Complaint
Reports
```

Objects of these classes are created when records need to be stored.

For example:

```java
Student student = new Student(
    id,
    name,
    age,
    course,
    roomNumber
);
```

---

## 3. Constructors

Constructors are used to initialize objects when they are created.

For example:

```java
public Student(int id, String name, int age, String course, int roomNumber) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.course = course;
    this.roomNumber = roomNumber;
}
```

---

## 4. ArrayList

`ArrayList` is used to store multiple objects dynamically.

For example, `StudentManager` maintains student objects in a collection, while `RoomManager`, `PaymentManager`, and `ComplaintManager` maintain their respective records.

Example:

```java
private ArrayList<Room> rooms = new ArrayList<>();
```

---

## 5. Methods

The application is divided into different methods so that each operation has a specific responsibility.

Examples include:

```text
addStudent()
updateStudent()
deleteStudent()
viewStudents()
searchStudent()

addRoom()
allocateRoom()
vacateRoom()

recordPayment()
searchPayment()

submitComplaint()
resolveComplaint()
```

This makes the program easier to understand and maintain.

---

## 6. Modular Programming

Instead of writing the entire application in one file, the project is divided into multiple classes.

For example:

```text
Student.java          → Student data
StudentManager.java   → Student operations

Room.java             → Room data
RoomManager.java      → Room operations

Payment.java          → Payment data
PaymentManager.java   → Payment operations
```

This separation improves the organization and readability of the project.

---

# 🖥️ Application Menu

When the program starts, the main menu is displayed:

```text
=================================
      HOSTEL MANAGEMENT SYSTEM
=================================
1. Student Management
2. Room Management
3. Payment Management
4. Complaint Management
5. Reports
6. Exit
Enter your choice:
```

The user can select a module by entering its corresponding number.

---

# 🔄 Student Management Menu

```text
===== STUDENT MANAGEMENT =====
1. Add Student
2. Update Student
3. Delete Student
4. View Students
5. Search Student
6. Back
```

---

# 🔄 Room Management Menu

```text
===== ROOM MANAGEMENT =====
1. Add Room
2. View Rooms
3. Search Room
4. Allocate Room
5. Vacate Room
6. Back
```

---

# 🔄 Payment Management Menu

```text
===== PAYMENT MANAGEMENT =====
1. Record Payment
2. Payment History
3. Search Payment
4. Back
```

---

# 🔄 Complaint Management Menu

```text
===== COMPLAINT MANAGEMENT =====
1. Submit Complaint
2. View Complaints
3. Search Complaint
4. Resolve Complaint
5. Back
```

---

# 📊 Reports Menu

```text
===== REPORTS =====
1. Occupancy Report
2. Payment Report
3. Complaint Report
4. Back
```

---

# ⚙️ How to Run the Project

## Prerequisites

Make sure Java is installed on your computer.

Check the Java version using:

```bash
java -version
```

Check the Java compiler using:

```bash
javac -version
```

---

## Step 1: Open the Project

Open the project folder in **VS Code**.

Make sure all the `.java` files are present in the same folder.

---

## Step 2: Open Terminal

In VS Code on Mac, open the integrated terminal using:

```text
Control + `
```

---

## Step 3: Compile the Project

Run:

```bash
javac *.java
```

If there are no compilation errors, the project has been compiled successfully.

---

## Step 4: Run the Application

Run:

```bash
java Main
```

The Hostel Management System menu will appear in the terminal.

---

# 🧪 Testing

The different modules can be tested using the following sample data.

## Student Test Data

```text
Student ID: 101
Name: Anya
Age: 20
Course: CSE AI ML
Room Number: 201
```

Test:

* Add student
* View student
* Search student
* Update student
* Delete student

---

## Room Test Data

```text
Room Number: 201
Capacity: 2
```

Test:

1. Add room.
2. Allocate room.
3. Allocate the same room again.
4. Check occupancy.
5. Try allocating when the room is full.
6. Vacate the room.
7. Check occupancy again.

---

## Payment Test Data

```text
Student ID: 101
Amount: 25000
Payment Date: 18-09-2026
Payment Mode: UPI
```

Test:

* Record payment
* View payment history
* Search payment

---

## Complaint Test Data

```text
Student ID: 101
Complaint: Fan is not working
Complaint Date: 18-09-2026
```

Test:

1. Submit complaint.
2. View complaint.
3. Search complaint.
4. Resolve complaint.
5. View complaint again and verify that the status changes from `Pending` to `Resolved`.

---

# 💾 Data Storage

The current version of the application uses:

```text
ArrayList
```

for storing records during program execution.

Therefore:

* Data is available while the program is running.
* No external database is required.
* No internet connection is required.
* Data is lost when the application is closed.

---

# 🔐 Current Limitations

The current version is a basic console-based implementation and has some limitations:

* Data is not permanently stored.
* There is no database connectivity.
* There is no graphical user interface.
* There is no login/authentication system.
* Room and student records are maintained in memory.
* Reports are basic console displays.
* Input validation is limited.

---

# 🚀 Future Enhancements

The project can be extended in the future by adding:

### Database Integration

Integrate **MySQL** or another database to permanently store:

* Student records
* Room information
* Payment records
* Complaints

### GUI

Develop a graphical interface using:

* JavaFX
* Swing

### Authentication

Add separate login systems for:

* Hostel Administrator
* Warden
* Students

### Advanced Room Management

Add features such as:

* Automatic room allocation
* Room availability checking
* Student-wise room assignment
* Different room types
* Hostel block management

### Payment Enhancements

Add:

* Payment due tracking
* Payment receipts
* Outstanding fee calculation
* Payment history by student

### Complaint Enhancements

Add:

* Complaint priority
* Complaint categories
* Resolution date
* Warden/admin assignment
* Complaint tracking

### Report Enhancements

Generate:

* Occupancy percentage
* Total collected payment
* Pending payments
* Pending complaints
* Resolved complaints
* Student-wise reports

---

# 📚 Learning Outcomes

Through this project, the following concepts were practiced:

* Java programming fundamentals
* Classes and objects
* Constructors
* Encapsulation
* Getters and setters
* Methods
* ArrayList
* Loops
* Conditional statements
* Switch-case
* Scanner for user input
* Modular programming
* Basic application design
* Menu-driven programming
* Error handling through validation conditions

---

# 👩‍💻 Project Type

**Academic Mini Project**

**Language:** Java
**Application Type:** Console-Based Application
**Data Storage:** In-Memory using ArrayList
**Development Environment:** VS Code

---

# 📌 Conclusion

The **Hostel Management System** provides a simple and structured approach to managing basic hostel operations through a Java console application.

The project separates different responsibilities into individual classes, making the application easier to understand, maintain, and extend. It demonstrates how Java and Object-Oriented Programming concepts can be applied to develop a practical management system.

The current implementation provides the foundation for a more advanced hostel management application that can later be extended with database connectivity, authentication, graphical interfaces, and permanent data storage.

---

## 👥 Project Modules

```text
Student Management
        ↓
Room Management
        ↓
Payment Management
        ↓
Complaint Management
        ↓
Reports
```

**Built using Java ☕**
