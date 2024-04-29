
/*
 * 1
 * 23
 * 345
 * 4567
 * 56789
 */

public class Pattern1 {

	public static void main(String[] args) {
		
		int n = 3;
		//this is no. of rows
	for(int i=1;i<=n;i++) {
		/*System.out.println(i);
		for(int j=2;j<=n;j++) {
			System.out.println(j);
		} */
		
		int a = 1;
		//print for num of column
		/*for(int j=i;a<=i;) {
	
			System.out.print(j++);
			a++;*/
		int j = i;
		while(a<=i) {
			System.out.print(j);
			j++;
			a++;
		}
		System.out.println();
	}
	
   }

}
