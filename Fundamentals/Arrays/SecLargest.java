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
        //largest 
     /*    int a=0;
        //second largest
        int b=0;
        //finding duplicate
        for(int i=0;i<arr.length;i++){
            //for comapring 
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
        // if second largest not found 
        if(b==0){
            return -1;
        }
        // if found then return b 
        return b;*/
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest=arr[i];
           
                }
        }
         if (secondLargest == Integer.MIN_VALUE){
            return -1;
         }
        else{
            return secondLargest;
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(secondLargest(arr));
        }
}
