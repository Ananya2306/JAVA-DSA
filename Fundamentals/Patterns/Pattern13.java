import java.util.*;
/*
 * Input => 5
 * Output =>
E
DE
CDE
BCDE
ABCDE
 */
public class Pattern13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            char ans = (char)('A'+n-i);

            for(int j = 1;j<=i; j++) {
             System.out.print((char)(ans+j-1));
            }

         System.out.println();
        }

        sc.close();
    }
}
