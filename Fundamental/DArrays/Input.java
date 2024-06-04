package DArrays;
import java.util.Scanner;

public class Input {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Print number of Rows:- ");
        int row = sc.nextInt();
        System.out.print("Print number of Columns:- ");
        int col = sc.nextInt();
        System.out.println();
        int n[][] = new int[row][col];
        System.out.println("Enter the Elements :- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               System.out.println( i + "th row "+ j +"th column");
                n[i][j] = sc.nextInt();
                
            }
        }
        sc.close();
        return n;
   
    }
   public static void main(String[] args) {
    int n[][] = takeInput();
    int row = n.length;
    int col = n[0].length;
    System.out.println("The matrix is:- ");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
         System.out.print(n[i][j]+" ");
        }
        System.out.println();
    }
   }
}
