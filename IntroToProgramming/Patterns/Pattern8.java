import java.util.*;
public class Pattern8 {
/*
 *Input => 4
 Output =>  ***1
            **12
            *123
            1234
 */

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {  
        for(int j = 1; j <=(n-i);j++) {
            System.out.print(" ");
        }
        for(int k =1; k<=i; k++) {
            System.out.print(k);
        }
       
       System.out.println();
       
       }
       
		sc.close();
	}

}

