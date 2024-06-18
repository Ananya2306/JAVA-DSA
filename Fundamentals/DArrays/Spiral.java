package DArrays;
/*
For a given two-dimensional integer array/list of size (N x M), 
print it in a spiral form. 
That is, you need to print in the order followed for every iteration:

a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
 */
import java.util.Scanner;

public class Spiral {
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
    public static void Form(int row, int col,int arr[][]){
        for(int i = 0; i<row;i++){
            for(int j = i;j<row-i;j++){
                System.out.print(arr[i][j]+" ");
            }
            for(int j = i+1;j<col-i;j++){
                System.out.print(arr[j][row-i-1]+" ");
            }
            for(int j = row-i-2;j>=i;j--){
                System.out.print(arr[col-i-1][j]+" ");
            }
            for(int j = col-i-2;j>i;j--){
                System.out.print(arr[j][i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = TakeInput();
        int row = arr.length;
        int col = arr[0].length;
        Form(row,col,arr);
       
    }
}
