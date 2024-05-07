import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number :- ");
		int num1 = sc.nextInt();

		System.out.print("Enter the Second number :- ");
		int num2 = sc.nextInt();
		
		System.out.println("Which operation Would u like to get result ?\n "
				+ "Enter the Number Displayed :- "
				+ "\n1. ADDITION "
				+ "\n2. SUBTRACTION "
				+ "\n3. MULTIPLICATION "
				+ "\n4. DIVISION "
				+ "\n5. REMAINDER => ");
		int ans = sc.nextInt();
		
		int sum = num1+num2;
		int diff = num1-num2;
		int multi = num1*num2;
		int divi = num1/num2;
		int remain = num1%num2;
		
		switch(ans) {
		case 1:
			System.out.println("Answer is : "+ sum);
			break;
		case 2:
			System.out.println("Answer is : "+ diff);
			break;
		case 3:
			System.out.println("Answer is : "+ multi);
			break;
		case 4:
			System.out.println("Answer is : "+ divi);
			break;
		case 5:
			System.out.println("Answer is : "+ remain);
			break;
		default :
			System.out.println("Invalid Number Entered !!!");
		}
		
		sc.close();
	}

}
