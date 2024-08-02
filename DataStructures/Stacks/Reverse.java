package Stacks;

import java.util.Scanner;

import Stacks.StackImplement.StackEmptyException;
import Stacks.StackImplement.StackUsingLL;

public class Reverse {
    public static StackUsingLL<Integer> takeInput() 
    {
        Scanner sr = new Scanner(System.in);
        
    	int size = sr.nextInt();
    	StackUsingLL<Integer> input = new StackUsingLL<>();

    	for(int i = 0; i < size; i++) 
    	{
    	    int var = sr.nextInt();
    		input.push(var);
    	}

		sr.close();
    	return input;
    }
	
	public static void Rev(StackUsingLL<Integer> populated, StackUsingLL<Integer> empty) throws StackEmptyException  {
	int temp ;
	int counter;
	int limiter = populated.size() - 1;
	for (int i = 0; i < populated.size() - 1; i++) {
		counter = i;
		empty.push(populated.pop());	
		temp = empty.pop();
		while (counter < limiter) {
			empty.push(populated.pop());
			counter++;
		}
		populated.push(temp);
		while (empty.size() != 0) {
			populated.push(empty.pop());
                    }
    }
		
	}

	public static void main(String[] args) throws StackEmptyException {
		
		StackUsingLL<Integer> populated = takeInput();
		StackUsingLL<Integer> empty = new StackUsingLL<Integer>();
		
		Rev(populated,empty);
		while(!populated.isEmpty()) {
			System.out.print(populated.pop() +" ");
		}
		
	}

}
