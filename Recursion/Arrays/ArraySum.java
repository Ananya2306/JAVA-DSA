package Arrays;
import java.util.Scanner;

public class ArraySum {
    public static int Sum(int arr[]){
      return HelperSum(arr, 0);
    }
    public static int HelperSum(int arr[],int startIndex){
        if(arr.length==startIndex){
            return 0;
        }
        int ans = arr[startIndex]+HelperSum(arr, startIndex+1);
        return ans;
    }
    /*
     3
     9 8 9
     return 9+8+9=26

        3
        4 2 1
        return 4+2+1=7
     */
    public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number :-");
            int n =sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the Array Elements :-");
            for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
            }
        System.out.println(Sum(arr));
        sc.close();
    }
}
