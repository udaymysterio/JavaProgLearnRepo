package smallJava;

import java.util.HashMap;

public class CharOccur {
    public static void main(String[] args) {
        String str = "automationManualTesting";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch:str.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch,charCount.get(ch)+1);
            } else {
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);
    }
}
