// package Constructore;

class Student {
    int id;
    String name;

    // Default Constructor (No parameters)
    Student(){
        id = 0;
        name = "Not Assign";
        System.out.println("Default Constructor called.");
    }
    // Parameterized Constructor (With parameters)
    Student(int i, String n){
        id = i;
        name = n;
        System.out.println("Parameterized Constructor called");
    }

    // Method to display the details
    void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student1 = new Student();
        student1.display();

        // Creating an object using the parameterized constructor
        Student student2 = new Student(101, "John Doe");
        student2.display();
    }
}