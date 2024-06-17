import java.util.*;

public class CharCase {

	public static void main(String[] args) {
	/*Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
	1, if the character is an uppercase alphabet (A - Z).
	0, if the character is a lowercase alphabet (a - z).
	-1, if the character is not an alphabet.*/
		
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		
		if(n>=65 && n<=90)
		{
			System.out.println("1");
		}
		else if(n>= 97 && n<=122) 
		{
			System.out.println("0");
		}
		else 
		{
			System.out.println("-1");
		}
		sc.close();
	}

}
