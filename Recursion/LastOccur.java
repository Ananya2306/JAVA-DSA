import java.util.Scanner;

public class LastOccur {
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
    public static int Last(int arr[],int x){
        
        return HelperIndices(arr,0,x);

    }
    public static int HelperIndices(int arr[],int startIndex,int x){
        if(arr.length==startIndex){
            return -1;
        }
        int ans = HelperIndices(arr,startIndex+1,x);
        if(arr[startIndex]==x && ans==-1){
            return startIndex;
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        int x = s.nextInt();
        int[] arr = takeInput();
        int result = Last(arr,x);
        System.out.println(result);
        s.close();
    }
}
