import java.util.*;

public class DataType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number :- ");
		int a = sc.nextInt();
		System.out.print("Enter the second number :- ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum is :- " + sum);

		System.out.println("Enter the String :- ");
		String n = sc.next();
		System.out.println("Enter the String :- ");
		String na = sc.nextLine();

		System.out.println("Enter a Float :- ");
		float f = sc.nextFloat();
		System.out.println(f);
		System.out.println(n);
		System.out.println(na);


		sc.close();
		
	}

}
