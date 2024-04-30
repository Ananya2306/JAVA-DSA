import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :-");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
        sc.close();
    }
}
