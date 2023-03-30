package Assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
      int n = sc.nextInt();
      int arr1[] = new int[n];
      int arr2[] = new int[n];
        System.out.println("Enter 1st element in array");
        for (int i = 0; i <n ; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the 2nd arrays element");
        for (int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }

        boolean ans  =true;
        for (int i = 0; i <n ; i++) {
            if(arr1[i]!=arr2[i]){
               ans=false;
               break;
            }

        }
        System.out.println(ans);

    }
}
