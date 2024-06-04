package DArrays;
/*
For a given two-dimensional integer array/list of size (N x M), 
find and print the sum of each of the row elements in a single line, 
separated by a single space.
 */
import java.util.Scanner;
public class RowSum {
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
      
        for(int i = 0;i < row;i++){
            int sum =0;
          for(int j =0;j<col;j++){
            sum += arr[i][j];
          }
          System.out.println(sum);
        }
    }
}
