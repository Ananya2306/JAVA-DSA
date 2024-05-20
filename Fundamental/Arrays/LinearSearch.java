import java.util.Scanner;

public class LinearSearch {
    /*
You have been given a random integer array/list(ARR) of size N, and an integer X. 
You need to search for the integer X in the given array/list using 'Linear Search'.
You have been required to return the index at which X is present in the array/list. 
If X has multiple occurrences in the array/list, 
then you need to return the index at which the first occurrence of X would be encountered. 
In case X is not present in the array/list, then return -1.

'Linear search' is a method for finding an element within an array/list. 
It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.'
Sample Input 1:
7
2 13 4 1 3 6 28
3
Sample Output 1:
4
 */

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
    public static int linearSearch(int[] arr, int x) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        int x = s.nextInt();
        int arr[] = takeInput();
        System.out.println(linearSearch(arr, x));
        s.close();
    }
}
