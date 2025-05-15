package ArrayPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDescend {
    public static void main(String[] args) {

        Scanner snr = new Scanner(System.in);
        System.out.print("Enter no. of elements for the array: ");
    //    int n, temp;
    //    int temp;
        int n = snr.nextInt();
        Integer[] a = new Integer[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = snr.nextInt();
        }
   /*     for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending order: ");
        for (int i = n - 1; i > 0; i++) {
            System.out.print(a[i] + ",");
        }
            System.out.print(a[0]);     */
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Arrays descending order: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
            snr.close();
        }
    }
