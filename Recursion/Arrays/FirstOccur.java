package Arrays;
import java.util.Scanner;
/*
Given an array of length N and an integer x, 
you need to find and return the first index of integer x present in the array. 
Return -1 if it is not present in the array.

First index means, the index of first occurrence of x in the input array.
 */
public class FirstOccur {
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
    public static int First(int arr[],int x){
        
        return HelperIndices(arr,0,x);

    }
    public static int HelperIndices(int arr[],int startIndex,int x){
        if(arr.length==startIndex){
            return -1;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        return HelperIndices(arr,startIndex+1,x);
    }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        int x = s.nextInt();
        int[] arr = takeInput();
        int result = First(arr,x);
        System.out.println(result);
        s.close();
    }
}
