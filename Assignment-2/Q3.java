package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
        System.out.println("Enter " + n + "element of an array");

        for (int i = 0; i <n ; i++) {
        arr[i]=sc.nextInt();
    }

        System.out.println("find kth smallest element ");
    int k = sc.nextInt();
    Arrays.sort(arr);
        System.out.println(" The " + k + " smallest element = " + arr[k-1]);
}
}
