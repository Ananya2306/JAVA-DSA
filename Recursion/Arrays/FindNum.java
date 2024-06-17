package Arrays;
import java.util.*;
public class FindNum {
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
    public static boolean Num(int[] arr,int x){
        return HelperNum(arr,0,x);
    }

    public static boolean HelperNum(int[] arr, int startIndex,int x){
        if(arr.length==startIndex){
            return false;
        }
        if(arr[startIndex]==x){
            return true;
        }
        return HelperNum(arr,startIndex+1,x);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        int x = s.nextInt();
        int[] arr = takeInput();
        boolean result = Num(arr,x);
        System.out.println(result);
        s.close();
    }
}
