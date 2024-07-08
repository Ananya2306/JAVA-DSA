
/*
 * 1
 * 23
 * 345
 * 4567
 * 56789
 */

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :- ");
		int n = sc.nextInt();
		//this is no. of rows
	for(int i=1;i<=n;i++) {
		int a = 1;
		//print for num of column 
		int j = i; 
		while(a<=i) {
			System.out.print(j);
			j++;
			a++;
		}
		System.out.println();
	}
	sc.close();
   }

}
