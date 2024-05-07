import java.util.Scanner;
/*
Write a program to input an integer 'n' and
print the sum of all its even digits and 
the sum of all its odd digits separately.

Digits mean numbers, not places!
 That is, if the given integer is "132456", 
 even digits are 2, 4, and 6, and 
 odd digits are 1, 3, and 5.
Input: 'n' = 132456

Output: 12 9

Explanation:
The sum of even digits = 2 + 4 + 6 = 12
The sum of odd digits = 1 + 3 + 5 = 9
 */
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        while (n> 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                evenSum= evenSum+ rem;
            } else {
                oddSum = oddSum+ rem;
            }
            n = n / 10;
        }
        System.out.println("Sum of Even Number :- "+evenSum +"\n"+ "Sum of Odd Number :-  " + oddSum);

        sc.close();
    }
}
