package CoreJava;

public class CharSplCount {
    public static void main(String[] args) {
        String srg = "HiViewers,Welcometotheworld@8:00 p.m! ";
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < srg.length(); i++) {
            if (srg.charAt(i) >= 'a' && srg.charAt(i) <= 'z') {
                count++;
            } else if (srg.charAt(i) >= 'A' && srg.charAt(i) <= 'Z') {
                count1++;
            } else if (srg.charAt(i) >= '0' && srg.charAt(i) <= '9') {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("no. of small letters: " + count);
        System.out.println("no. of capital letters: " + count1);
        System.out.println("no. of digits: " + count2);
        System.out.println("no. of special characters: " + count3);
    }
}
