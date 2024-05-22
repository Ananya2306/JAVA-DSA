/*
 Given an array A[] of size n. The task is to find the largest element in it.
 */

import java.util.Scanner;

public class Largest {
    
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

    public static int Large(int[] arr){
        int large = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(Large(arr));
    }

}
