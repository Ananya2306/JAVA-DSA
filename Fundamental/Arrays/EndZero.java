import java.util.Scanner;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */
public class EndZero {
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

    public static void endZero(int[] arr) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int c = arr[a];
                arr[a] =arr[i];
                arr[i] = c;
                a++;    
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        endZero(arr);
    }
}
