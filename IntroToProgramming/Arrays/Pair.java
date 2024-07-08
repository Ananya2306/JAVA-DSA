import java.util.*;
/*
You have been given an integer array/list(ARR) and a number X. 
Find and return the total number of pairs in the array/list which sum to X.
Given array/list can contain duplicate elements

Sample Input 1 :
9
1 3 6 2 5 4 3 2 4
7
 */
public class Pair {
    public static int[]  takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static int pairSum(int[] arr, int x) {
        int count = 0;
        for(int i =0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X :- ");
        int x = sc.nextInt();
        int arr[] = takeInput();
        System.out.println(pairSum(arr,x));
        sc.close();
    }
}
