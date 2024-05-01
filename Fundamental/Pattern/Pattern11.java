import java.util.*;
/*
 * Input => 5
 * Output => 
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 */
public class Pattern11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :-");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A'+i));
            }
           System.out.println();
        }
        sc.close();
    }
}
