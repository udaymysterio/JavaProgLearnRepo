package ArrayPackage;

import java.util.Scanner;

public class ArrayAscend {
    public static void main(String[] args) {
        int n, temp;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = scn.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the numbers: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        }
        System.out.print("Ascending order: ");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.println(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
