package Assignment3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();

        int arr[]=new int[n-1];
        System.out.println("Enter the element of an array");

        for (int i = 0; i <n-1; i++) {
            arr[i]=sc.nextInt();
        }

        int totalSum = n*(n+1)/2; // sum of n natural numbers
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
        }
       int missingNo =  totalSum-sum;
        System.out.println("this number is missing = "+missingNo);

    }
}
