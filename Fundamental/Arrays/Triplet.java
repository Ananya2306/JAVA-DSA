import java.util.Scanner;
/*
You have been given a random integer array/list(ARR) and a number X.
 Find and return the number of triplets in the array/list which sum to X.
Input1 :-
12
7
1 2 3 4 5 6 7 
Output 1:
5
 */
public class Triplet {
     public static int[]  takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int tripletSum(int[] arr, int x) {
        int count = 0;
        for(int i =0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        count++;
                    }
                }
                  
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X :- ");
        int x = sc.nextInt();
        int arr[] = takeInput();
        System.out.println(tripletSum(arr,x));
        sc.close();
    }
}
