package CoreJava;

import java.security.Key;

public class KeyPosition {
    public int binarySearch(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        KeyPosition kps = new KeyPosition();
        int[] arr = {2,4,5,8,10,12,14,16};
        System.out.println("Key 14's position is: " +kps.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: " +kps.binarySearch(arr1, 432));
    }
}

