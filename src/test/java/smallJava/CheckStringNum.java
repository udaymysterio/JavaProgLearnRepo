package smallJava;

public class CheckStringNum {
    public static void main (String[] args) {
        String regen = "[0-9]+";
        String data = "488555655566541";
        System.out.println("Is Number:" + data.matches(regen));
    }
    }

