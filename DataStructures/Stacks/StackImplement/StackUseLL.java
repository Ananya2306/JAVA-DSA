package Stacks.StackImplement;

public class StackUseLL {
    public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		for(int i=1; i<=5; i++ ) {
			stack.push(i);
			
		}
		while(!stack.isEmpty()) {
			
			try {
				System.out.println(stack.pop());
			}catch(StackEmptyException e) {
				//System.out.println(stack.());
			}
		}
		
	}

}
