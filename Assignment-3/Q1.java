package Assignment3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array n =");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + "element of an array ");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element of an x to find pair of absolut diff");
        int x = sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[j]-arr[i]==x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }
}
