/*
You have been given an array/list(ARR) of size N.
You need to swap every pair of alternate elements in the array/list.

You don't need to print or return anything, just change in the input array itself.
 */

import java.util.Scanner;

public class AltSwap {

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
    public static void Alternate(int[] arr){
        for(int i=0;i<arr.length;i+=2)
        {
          
        int swap = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=swap;
        
        }
            
          }

          public static void main(String[] args) {
            int[] arr = takeInput();
            Alternate(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            

          }
}
