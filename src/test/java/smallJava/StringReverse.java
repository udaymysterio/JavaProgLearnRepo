package smallJava;

public class StringReverse {
    public
    static void main(String[] args) {
        String original = "automation";

        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " +reversed);
    }
}
