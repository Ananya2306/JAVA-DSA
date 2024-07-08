/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
Write a function to sort this array/list.
Think of a solution which scans the array/list only once and don't require use of an extra array/list
 */

import java.util.Scanner;

public class Sort {
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

    public static void sort(int[] arr) {
        int a=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
                  
                    int c = arr[a];
                    arr[a] =arr[i];
                    arr[i] = c;
                    a++;    
                }       
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        sort(arr);
    }
}
