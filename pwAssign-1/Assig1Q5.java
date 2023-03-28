import java.util.Scanner;
//peak element
public class Assig1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an  array n =");
        int n = sc.nextInt();
        int arr[]= new int[n];
       System.out.println("Enter " +n+ "element of an array");
       for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
       }

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
break;
            }
        }
    }
}
