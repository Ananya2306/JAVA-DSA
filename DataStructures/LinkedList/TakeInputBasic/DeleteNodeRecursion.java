package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class DeleteNodeRecursion {
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
    public static Node<Integer> DeleteNode(Node<Integer> head , int pos) {
        if (head == null) {
            return head;
        }
        if (pos==0) {
            head=head.next;
            return head;
        } else {
            Node<Integer> newHead=DeleteNode(head.next,pos-1);
            head.next = newHead;
            return head;
        }  
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
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        Node<Integer> head = TakeInput();
        head = DeleteNode(head,pos);
        printList(head);
        sc.close();
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}