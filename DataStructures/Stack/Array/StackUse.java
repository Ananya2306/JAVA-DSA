package DataStructures.Stack.Array;

public class StackUse {
    public static void main(String[] args) throws StackFullException {
        //intialization
        StackUsingArray stack = new StackUsingArray();
        //pushing elements
        for(int i = 0; i < 6; i++) {
            stack.push(i);
        }
        //continues till stack is not empty 
        while(!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            }catch(StackEmptyException e){

            }
        }
    }   
}
