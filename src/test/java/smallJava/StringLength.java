package smallJava;

public class StringLength {
    public static void main(String[] args) {
        String str = "automation testing";
        int length = 0;
        try {
            while(true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
    }
        System.out.println("Length of string: " + length);
}}
