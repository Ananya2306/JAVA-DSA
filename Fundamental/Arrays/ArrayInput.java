import java.util.*;
/*
 Input 5 
  1 2 3 4 5
 Output => 1 2 3 4 5

 */
public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array :- ");
		int size = sc.nextInt();
		int number[] = new int[size];
		System.out.println("Enter the Numbers to be printed :- ");
		for(int i = 0;i<size;i++) {
			number[i] = sc.nextInt();
		}	
		System.out.println("Stored numbers :- ");
		for(int i=0;i<size;i++) {
			System.out.print(number[i]+ " ");
		}
		sc.close();
	}

}

