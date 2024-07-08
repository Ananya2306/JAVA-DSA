package ArrayList;
import java.util.ArrayList;
public class MSort {

	 public static void Divide(int arr[],int startIndex,int endIndex){
	        if(startIndex>=endIndex){
	            return;
	        }
	        int mid = startIndex+(endIndex-startIndex)/2;
	        Divide(arr,startIndex,mid);
	        Divide(arr,mid+1,endIndex);
	        Conquer(arr,startIndex,mid,endIndex);
	    }
	 public static void Conquer(int arr[],int startIndex,int mid,int endIndex){
	        //int merged[] = new int[endIndex-startIndex+1];
	        ArrayList<Integer> merged = new ArrayList<Integer>();

	        int index1 = startIndex;
	        int index2 = mid+1;
	       // int x = 0;
	        while(index1<=mid && index2<=endIndex){
	            if(arr[index1]<=arr[index2]){
	                merged.add(arr[index1]);
	                index1++;
	            }
	            else{
	                merged.add(arr[index2]);
	                index2++;
	            }
	        }

	            while(index1<=mid){
	                merged.add(arr[index1]);
	                index1++;
	            }
	            while (index2<=endIndex) {
	                merged.add(arr[index2]);
	                index2++;
	            }

	            for(int i=0, j=startIndex;i<merged.size();i++,j++){
	                arr[j] = merged.get(i);
	            }
	    }
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		Divide(arr,0,arr.length-1);
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
