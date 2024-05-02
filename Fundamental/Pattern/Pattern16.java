import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :-");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;
//[ 1, 1, 2, 3, 5, 8, 13, 21]
        for (int i = 0; i < n; i++) {
            n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            
            System.out.print(n1);
        sc.close();
    }
}
