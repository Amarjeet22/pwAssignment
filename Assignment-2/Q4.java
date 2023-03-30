package Assignment2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array n = ");
        int n = sc.nextInt();
        System.out.println("Enter sum s = ");
        int s = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the element of an array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0, j=i+1 ;  i <n-1 ; i++ ,j++) {
            if(arr[i]+arr[j]==s){
                System.out.print(arr[i]+ " ");
                System.out.println(arr[j] + " ");
            }
        }
    }
}
