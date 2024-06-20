package MergeSort;

import java.util.Scanner;

public class MSort {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of Array:- ");
        for(int i =0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void Divide(int arr[],int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int mid = startIndex+(endIndex-startIndex)/2;
        Divide(arr,startIndex,mid);
        Divide(arr,mid+1,endIndex);
        Conquer(arr,startIndex,mid,endIndex);
    }
    public static void Conquer(int arr[],int startIndex,int mid,int endIndex){
        int merged[] = new int[endIndex-startIndex+1];

        int index1 = startIndex;
        int index2 = mid+1;
        int x = 0;
        while(index1<=mid && index2<=endIndex){
            if(arr[index1]<=arr[index2]){
                merged[x++] =arr[index1++];
            }
            else{
                merged[x++] =arr[index2++];
            }
        }

            while(index1<=mid){
                merged[x++] =arr[index1++];
            }
            while (index2<=endIndex) {
                merged[x++] =arr[index2++];
            }

            for(int i=0, j=startIndex;i<merged.length;i++,j++){
                arr[j] = merged[i];
            }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int n = arr.length;
        Divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
