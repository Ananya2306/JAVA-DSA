import java.util.*;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the student :- ");
		char name = sc.next().charAt(0);// (Ananya) 0 = A ,1 = n, 2 = a, 3 = n, 4 = y , 5 = a
		System.out.print("Enter the marks 1  :- ");
		int m1 = sc.nextInt();
		System.out.print("Enter the marks 2 :- ");
		int m2 = sc.nextInt();
		System.out.print("Enter the marks 3 :- ");
		int m3 = sc.nextInt();

		int avg = (m1 + m2 + m3) / 3;
		System.out.println("Name of the Student :- " + name + "\nHis Average marks :- " + avg);

	}

}
