//Create a class called Student. Write a student manager program to 
// manipulate the student information from files by using FileInputStream 
// and FileOutputStream. 

import java.io.*;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public static void main(String[] args) {
        // Creating a sample student
        Student student = new Student("John Doe", 20, "A");

        // Writing student information to a file
        try (FileOutputStream fileOutputStream = new FileOutputStream("john.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("Student information written to file successfully.");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // Reading student information from the file
        try (FileInputStream fileInputStream = new FileInputStream("student.txt")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student readStudent = (Student) objectInputStream.readObject();
            System.out.println("Student information read from file:");
            System.out.println(readStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}