import java.util.Scanner;

public class Multiplication {
    public static int multiply(int m, int n) {
        // if a num * by 1 give 1
        if (n == 1) {
            return m;
        }
        return m + multiply(m, n - 1);
        /*
         3*5 = 3+3+3+3+3
         */
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
