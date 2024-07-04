package LinkedList;

public class LL2 {
 
	public static void printList(Node<Integer> head) {
		 Node<Integer> temp = head;
	       // int size =0;
	        while(temp!=null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	            //size++;
	        }
	        
	}
	public static int SizeL(Node<Integer> head) {
		 Node<Integer> temp = head;
	        int size =0;
	        while(temp!=null) {
	           size++;
	            temp = temp.next;
	        }
	        return size;
	
	}
	public static void main(String[] args) {
		
		 Node<Integer> n1 = new Node<Integer>(1);
	        Node<Integer> n2 = new Node<Integer>(2);
	        
	        n1.next = n2;
	        System.out.println(SizeL(n1));
	        printList(n1);
	 
	        
	       
	}

}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
