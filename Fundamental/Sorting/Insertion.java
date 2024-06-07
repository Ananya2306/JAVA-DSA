package Sorting;

import java.util.Scanner;

public class Insertion {
     public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void InsertionSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int store = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>store){
                arr[j+1] = arr[j];
                j--;
            }
        arr[j+1]=store;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        InsertionSort(arr);
    }
}
