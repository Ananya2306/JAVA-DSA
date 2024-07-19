package LinkedList.UserInput;
/*
Given a singly linked list of integers, 
reverse it using recursion and return the head to the modified list. 
You have to do this in O(N) time complexity where N is the size of the linked list.
 */
import java.util.Scanner;

public class ReverseRecursion {
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
    public static Node<Integer> Rev(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> newHead = Rev(head.next);
        // new head = head of reverse
        Node<Integer> node = newHead;
        // traverse unit last node
        while(node.next!=null){
            node = node.next;
        }
        node.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        Node<Integer> node = Rev(head);
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }

    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}