package smallJava;

import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {
        Scanner cann = new Scanner(System.in);

        System.out.println("Mention a tourist place  ");
        String tri = cann.nextLine();

        System.out.println("What is the lucky number? ");
        int rin = cann.nextInt();
        cann.nextLine();

        System.out.println("Which brand tennis racquet it is? ");
        String tin = cann.nextLine();

        System.out.println("The place is " + tri);
        System.out.println("number is- " + rin);
        System.out.println("Brand of tennis racquet is " + tin);
    }
}
