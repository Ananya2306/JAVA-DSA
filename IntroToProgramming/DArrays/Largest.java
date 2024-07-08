package DArrays;

import java.util.Scanner;

/*
For a given two-dimensional integer array/list of size (N x M), 
you need to find out which row or column has the largest sum
(sum of all the elements in a row or column) amongst all the rows/columns.

 */
public class Largest {
     public static int[][] takeInput(){
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
        int[][] arr = takeInput();
        int row = arr.length;
        int col = arr[0].length;
        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;
        int maxRow=0;
        int maxCol = 0;
        for(int i = 0;i < row;i++){
            int sum = 0;
            for(int j = 0;j < col;j++){
                sum += arr[i][j];
            }
            if(sum > maxRowSum){
                maxRowSum = sum;
                maxRow = i;
            }
        }
        for(int j = 0;j < col;j++){
            int sum = 0;
            for(int i = 0;i < row;i++){
                sum += arr[i][j];
            }
            if(sum > maxColSum){
                maxColSum = sum;
                maxCol = j;
            }
        }
       if(maxRowSum>maxColSum){
        System.out.println("Row " + maxRow + " has the maximum sum: " + maxRowSum);
       }else{
        System.out.println("Column " + maxCol + " has the maximum sum: " + maxColSum);
       }
    }
}
