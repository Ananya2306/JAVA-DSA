import java.util.*;
/*Input =>4
Output =>
   1
  232
 34543
4567654
 */
public class Pattern14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {  
            for(int j = 1; j <=(n-i);j++) {
                System.out.print(" ");
            }
            for(int k =0; k<i; k++) {
                System.out.print(k+i);
            }
            int z = 2*i-2;
           for(int l = 1; l<=i-1; l++) {
           
               System.out.print(z--);
            
            }
           System.out.println();
           
           }
           
        sc.close();
    }
}
