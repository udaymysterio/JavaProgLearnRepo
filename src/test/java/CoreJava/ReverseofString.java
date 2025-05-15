package CoreJava;

import java.util.Scanner;

public class ReverseofString {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner linq = new Scanner(System.in);
        System.out.println("Enter a string to reverse ");
        original = linq.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse of entered string is: " +reverse);
    }
}
