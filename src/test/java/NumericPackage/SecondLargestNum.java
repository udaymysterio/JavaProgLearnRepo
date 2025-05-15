package NumericPackage;

public class SecondLargestNum {
    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if(num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 50};
        System.out.println("Second largest: " + secondLargest(arr));
    }
}
