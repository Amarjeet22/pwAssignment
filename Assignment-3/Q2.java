package Assignment3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ "element of an araay");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int coutn =0;
        System.out.println("Enter the element x to find total number of occurrences ");
        int x =sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                coutn++;
            }
        }
        System.out.println(coutn);
    }
}
