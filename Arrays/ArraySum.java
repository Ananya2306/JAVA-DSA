import java.util.*;
/*
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
 */
public class ArraySum {
    //Function for taking Input in Array
	public static int[] takeInput(){
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
		}
		//Function for Calculating Sum
	public static void Calculate(int number[]) {
			int sum =0;
			for(int i =0;i<number.length;i++) {
				sum = sum +number[i];
			}
			System.out.print("SUM:- "+ sum);
	}

	public static void main(String[] args) {
		//Calling Functions
		int arr[] = takeInput();
		Calculate(arr);
	}

}
