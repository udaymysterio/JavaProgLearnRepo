package smallJava;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String sg = "Uday bajji kumar";
        String[] s1 = sg.split(" ");
        HashMap<String, Integer> emp = new HashMap<String, Integer>();

        for (String c : s1) {
            if (emp.containsKey(c)) {
                int x = emp.get(c);
                emp.put(c, x + 1);
            } else {
                emp.put(c, 1);
            }
        }
    System.out.println(emp);
    }
}
