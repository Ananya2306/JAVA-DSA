import java.util.Scanner;

public class Smallest {
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

    public static int Small(int[] arr){
        int small = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(Small(arr));
    }


}
