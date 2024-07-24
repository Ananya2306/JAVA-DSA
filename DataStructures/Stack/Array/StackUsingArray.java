package DataStructures.Stack.Array;

public class StackUsingArray {
    //used to store stack elements
    private int data[];
    //index of top element in stack
    private int topIndex;
    //constructor
    public StackUsingArray() {
        // array size
        data = new int[10];
        //stack is empty
        topIndex = -1;
    }
    //methods
    // number of elements 
    public int size() {
        return topIndex + 1;
    }
    // stackis empty
    public boolean isEmpty() {
        return topIndex == -1;
    }
    //
    public void push(int value) throws StackFullException {
        if (topIndex == data.length - 1) {
            StackFullException e = new StackFullException();
            throw e;
        }
        topIndex++;
        data[topIndex] = value;
    }

    public int top() throws StackEmptyException {
        if(topIndex==-1) {
	        throw new StackEmptyException();
	      }
	        return data[topIndex];
    }
    // removes and returns 
    public int pop() throws StackEmptyException {
        if(topIndex==-1) {
            throw new StackEmptyException();
        }
        int poppedValue = data[topIndex];
        topIndex--;
        return poppedValue;
    }

}