package Stacks;

import java.util.Scanner;

import Stacks.StackImplement.StackEmptyException;
import Stacks.StackImplement.StackUsingLL;

public class BracketBalance {
    public static boolean Balance(String brackets) throws StackEmptyException {
        StackUsingLL<Character> brac = new StackUsingLL<Character>();

        // LOOP for brackets=> ( )
        for (int i = 0; i < brackets.length(); i++) {
            // string => character
            char c = brackets.charAt(i);

            // Switch case for char c
            switch (c) {
                case '(':
                    brac.push(c);
                    break;
                case ')':
                    // Empty case
                    if (brac.isEmpty()) {
                        return false;
                    } else {
                        if (brac.top() != '(') {
                            return false;
                        } else {
                            brac.pop();
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return brac.isEmpty();
    }

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();   
		try {
            
            System.out.println(Balance(str));
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
		sc.close();
		}
}
