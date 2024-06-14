import java.util.Scanner;

public class FirstOccur {
    public static int[] takeInput(){
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
    public static int First(int arr[],int x){
        
        return HelperIndices(arr,0,x);

    }
    public static int HelperIndices(int arr[],int startIndex,int x){
        if(arr.length==startIndex){
            return -1;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        return HelperIndices(arr,startIndex+1,x);
    }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        int x = s.nextInt();
        int[] arr = takeInput();
        int result = First(arr,x);
        System.out.println(result);
        s.close();
    }
}
