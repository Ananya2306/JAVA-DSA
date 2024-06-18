import java.util.*;
/*
 You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
 Each number is present at least once. 
 That is, if N = 5, the array/list constitutes values ranging from 0 to 3 
 and among these, there is a single integer value that is present twice. 
 You need to find and return that duplicate number present in the array.

Duplicate number is always present in the given array/list.
 */
public class Duplicate {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
    public static int Dupli(int[] arr) {
        for(int i =0;i<arr.length;i++){
            int a =0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    a++;
                }
                
            }
            if(a>0){
                return arr[i];
            }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(Dupli(arr));


    }
}
