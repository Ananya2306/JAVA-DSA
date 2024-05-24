import java.util.Scanner;

public class SecSmallest {
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
    public static int Smallest(int[] arr) {
        int Small_1 = Integer.MAX_VALUE;
        int Small_2 = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] < Small_1) {
                Small_2 = Small_1;
                Small_1 = arr[i];
            }
            else if(arr[i] < Small_2 && arr[i]!=Small_1) {
                Small_2 = arr[i];
            }
        }
        if(Small_2==Integer.MAX_VALUE){
            return -1;
        }else {
            return Small_2;
        }
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(Smallest(arr));
    }
}
