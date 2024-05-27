/*
You are given an integer array 'A' of size 'N', sorted in non-decreasing order. 
You are also given an integer 'target'.
Your task is to write a function to search for 'target' in the array 'A'. 
If it exists, return its index in 0-based indexing. 
If 'target' is not present in the array 'A', return -1.
 */

import java.util.Scanner;

public class Target {
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

    public static int Find(int[] arr, int x) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Target:- ");
        int x = s.nextInt();
        int[] arr = takeInput();
        int ans = Find(arr,x);
        System.out.println(ans);
        s.close();
    }
}
