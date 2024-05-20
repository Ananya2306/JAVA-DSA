import java.util.*;

public class Populate {
/*
You have been given an empty array(ARR) and its size N. 
The only input taken from the user will be N and you need not worry about the array.

Your task is to populate the array using the integer values 
in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
You need not print the array. You only need to populate it.

Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2


Explanation of Sample Input 1 :
Since the value of N is 6,
the number will be stored in the array 
in such a fashion that 1 will appear at 0th index, 
then 2 at the last index, 
in a similar fashion 3 is stored at index 1. 
Hence the array becomes 1 3 5 6 4 2.
   
*/
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.close();
        return arr;
    }
    public static void populate(int[] arr) {
        int left= 0;
        int right = arr.length - 1;
        int counter =1;
       while(left<=right){
        if(counter%2==1){
            arr[left] = counter;
            left++; 
        }
        else{
            arr[right] = counter;
            right--;
        }
        counter++;

       }
    }

    public static void main(String[] args) {
       int arr[] = takeInput();
        populate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}