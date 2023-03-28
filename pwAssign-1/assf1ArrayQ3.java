public class assf1ArrayQ3 {
    //Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
    //elements.
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7,8};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]);

            }
        }
    }
}
