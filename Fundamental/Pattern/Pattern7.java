import java.util.Scanner;
/* input =
 * Enter the number:- 
4
output =
1234
123
12
1
 */
public class Pattern7 {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n = sc.nextInt();
	      
	       for(int i=1; i<=n; i++) {
	           for(int j=1; j<=n-i+1; j++) {
	                   System.out.print(j);
	           }
	           System.out.println();
	       }
           sc.close();
	}

}


