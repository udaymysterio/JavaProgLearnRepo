package ArrayPackage;

public class LargestSmallestArrayi {
    public static void main(String[] args) {

        int[] array = {5, 2, 9, 1, 6, 3};
        int[] result = findLargestSmallest(array);

        System.out.println("Smallest element: " + result[0]);
        System.out.println("Largest element: " + result[1]);
    }

    public static int[] findLargestSmallest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int smallest = array[0];
        int largest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        return new int[] {smallest, largest};
    }
}

