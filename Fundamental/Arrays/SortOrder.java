/*
Given an array of size n, 
write a program to check if the given array is sorted in 
(ascending / Increasing / Non-decreasing) order or not. 
If the array is sorted then return True, Else return False.
 */

import java.util.Scanner;

public class SortOrder {
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
    public static boolean Sorted(int[] arr) {
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(Sorted(arr));
    }
}
