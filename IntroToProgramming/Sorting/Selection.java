package Sorting;
import java.util.*;
public class Selection {
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

    public static void Select(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int smallest =i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest =j;
                }
            }
            int swap = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=swap;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        Select(arr);
    }
}
