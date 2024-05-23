import java.util.Scanner;

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
}
