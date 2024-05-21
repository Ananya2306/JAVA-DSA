import java.util.Scanner;
/*
You have been given an integer array/list(ARR) of size N. 
Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.
Unique element is always present in the array/list according to the given condition.
 */
public class Unique {
    
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
    public static int Uni(int[] arr){
        int a;
        for(int i=0;i<arr.length;i++){
            a=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    a++;
            }
            if(a==1)
            {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(Uni(arr));
    }
}
