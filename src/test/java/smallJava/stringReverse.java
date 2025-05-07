package smallJava;

public class stringReverse {
    public
    static void main(String[] args) {
        String original = "automation";

        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " +reversed);
    }
}
