package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class ReverseIterative {
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
    public static Node<Integer> Rev(Node<Integer> head) {
        Node<Integer> prev = null;
        Node<Integer> current = head;
        Node<Integer> next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;

    }
    public static void printList(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        printList(Rev(head));
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
