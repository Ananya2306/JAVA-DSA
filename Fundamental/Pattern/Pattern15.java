import java.util.*;
/*
 Enter the number :- 3
  *
 ***
*****
 ***
  *
 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        for(int i =1;i<=n;i++) {
            for(int j = 1;j<=n-i;j++) {
               System.out.print(" ");
                }
                for(int k =1;k<=i*2-1;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i =n-1;i>0;i--){
                for(int j = 1;j<=n-i;j++) {
                    System.out.print(" ");
                }
                for(int k =1;k<=i*2-1;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        sc.close();

    }
}
