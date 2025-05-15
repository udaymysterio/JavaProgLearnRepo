package ArrayPackage;

import java.util.Arrays;

public class StringArraySort {
    public static void main(String[] args) {
        String stg = "udaykumar";
        char[] a = stg.toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
