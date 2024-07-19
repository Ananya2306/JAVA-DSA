package LinkedList.UserInput;
/*
 * For a given singly linked list of integers, 
 * arrange the nodes such that all the even number nodes are placed after the all odd number nodes. 
 * The relative order of the odd and even terms should remain unchanged.
 */
import java.util.Scanner;

public class ArrangeOddEven {
    public static Node<Integer> TakeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				head = newNode;
				tail=newNode;
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = sc.nextInt();
		}
		sc.close();
		return head;
	}

    public static void printList(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> Arrange(Node<Integer> head){
        if(head==null){
            return null;
        }
        Node<Integer> odd = new Node<Integer>(0);
        Node<Integer> even = new Node<Integer>(0);

        //current
        Node<Integer> temp = head;
        Node<Integer> tempOdd = odd;
        Node<Integer> tempEven = even;
        //traverse
        while(temp!=null){
            if(temp.data%2==0){
                tempEven.next = temp;
                tempEven = tempEven.next;
            }else{
                tempOdd.next = temp;
                tempOdd = tempOdd.next;
            }
            temp = temp.next;
        }
        tempEven.next = null;
        tempOdd.next = even.next;
        return odd.next;

    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        head = Arrange(head);
        printList(head);
        
    }

}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}