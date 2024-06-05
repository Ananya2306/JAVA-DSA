package DArrays;
/*
For a given two-dimensional integer array/list of size (N x M), 
print the array/list in a sine wave order, 
i.e, print the first column top to bottom, 
next column bottom to top and so on.
 */
import java.util.Scanner;

public class Wave {
     public static int[][] TakeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int row = s.nextInt();
        System.out.print("Enter the number of columns:- ");
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = TakeInput();
        int row = arr.length;
        int col = arr[0].length;

        for(int j =0;j<col;j++){
            for(int i =0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            j++;
            if(j==col){
                break;
            }
            for(int i =row-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}
