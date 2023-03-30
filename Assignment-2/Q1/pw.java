package Assignment2.Q1;

import java.util.Scanner;

public class pw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array n ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " element of an array");
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans[] = new int[n];
        int j =0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>=0){
                ans[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]<0){
                ans[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
