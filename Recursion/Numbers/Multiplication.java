package Numbers;
import java.util.Scanner;
/*
 * Given two integers M & N, 
 * calculate and return their multiplication using recursion. 
 * You can only use subtraction and addition for your calculation
 */
public class Multiplication {
    public static int multiply(int m, int n) {
        
        if (n == 0) {
            return 0;
        }
        return m + multiply(m, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int M = sc.nextInt();
        System.out.print("Enter the second number :- ");
        int N = sc.nextInt();
        System.out.println(multiply(M, N));
        sc.close();
    }
}
