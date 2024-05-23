import java.util.Scanner;
/*
 Given an array Arr of size N, print the second largest distinct element from an array.
If the second largest element doesn't exist then return -1.
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
 */
public class SecLargest {
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
    public static int secondLargest(int[] arr) {
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==0){
                if(arr[i]>a){
                    b=a;
                    a=arr[i];
                }
                else if(arr[i]>b){
                    b=arr[i];
                }
            }
        }
        if(b==0){
            return -1;
        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(secondLargest(arr));
        }
}
