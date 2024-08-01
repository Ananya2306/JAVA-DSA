package Queues.QueueImplement;

//import org.w3c.dom.Node;

public class QueueUsingLL<T> {
   private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(T val) {
		Node<T> newNode = new Node<T>(val);
		if(front==null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear=newNode;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException{
		if(front!=null) {
			T temp = front.data;
			front = front.next;
			size--;
			return temp;
		}
		return front.data;
	}
	
	T front() throws QueueEmptyException {
		if(front!=null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
}
class Node<T> {
	T data;
	Node<T> next;
	public Node(T data){
		this.data = data;
	}
}
