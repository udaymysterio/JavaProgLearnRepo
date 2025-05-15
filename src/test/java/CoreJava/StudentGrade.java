package CoreJava;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = scn.nextInt();
        if (100 >= n && n >= 90) {
            System.out.println("S Grade");
        } else if (89 >= n && n >= 80) {
            System.out.println("A grade");
        } else if (79 >= n && n >= 70) {
            System.out.println("B grade");
        } else if (69 >= n && n >= 60) {
            System.out.println("C grade");
        } else if (59 >= n) {
            System.out.println("Fail");
        }
    }
}
