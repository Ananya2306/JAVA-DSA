import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :-");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
           // System.out.println(i);
           for(int j =1;j<=i;j++){
            System.out.print(i-j+1);

           }
            System.out.println();
        }
    sc.close();
    }
}
