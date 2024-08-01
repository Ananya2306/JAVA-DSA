package Stacks.StackImplement;

//import org.w3c.dom.Node;

public class StackUsingLL<T> {
    private Node<T> head;
	private int size;
	//constructor
	public StackUsingLL() {
		head = null;
		size =0;
	}
	//methods
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void push(T val) {
		Node<T> newNode = new Node<T>(val);
		newNode.next=head;
		head = newNode;
		size++;
	}
	
	public T top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public T pop() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head= head.next;
		size--;
		return temp;
		
	}
}
class Node<T> {
	T data;
	Node<T> next;
	public Node(T data){
		this.data = data;
	}
}
