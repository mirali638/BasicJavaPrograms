/*Write a program to find out whether a student is pass or fail; 
    if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 
    subjects and take marks as input from the user.*/

import java.util.Scanner;

import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations, You have been promoted");
        } else {
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }
    }
}
