package Sorting;

import java.util.Scanner;

public class Bubble {
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

    public static void Bub(int arr[]){
       
        for(int i = 0;i<arr.length-1;i++){
            int dswap = 0;
            for(int j = 0;j <arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    dswap =1;
                }
            }
            if(dswap==0){
                break;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        Bub(arr);
    }
}
