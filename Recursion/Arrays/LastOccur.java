package Arrays;
import java.util.Scanner;
/*
Given an array of length N and an integer x, 
you need to find and return the last index of integer x present in the array. 
Return -1 if it is not present in the array.

Last index means - if x is present multiple times in the array, 
return the index at which x comes last in the array.

You should start traversing your array from 0, not from (N - 1)
 */
public class LastOccur {
      public static int[] takeInput(){
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
    public static int Last(int arr[],int x){
        
        return HelperIndices(arr,0,x);

    }
    public static int HelperIndices(int arr[],int startIndex,int x){
        if(arr.length==startIndex){
            return -1;
        }
        int ans = HelperIndices(arr,startIndex+1,x);
        if(arr[startIndex]==x && ans==-1){
            return startIndex;
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        int x = s.nextInt();
        int[] arr = takeInput();
        int result = Last(arr,x);
        System.out.println(result);
        s.close();
    }
}
