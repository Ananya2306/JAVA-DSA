package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class AppendLast {
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
    public static void Print(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node<Integer> Append(Node<Integer> head, int data) {
        Node<Integer> newNode = new Node<Integer>(data);
        if(head == null) {
            return newNode;
        }
        Node<Integer> temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = TakeInput();
        Print(Append(head,data));
        sc.close();

}
}
class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
    }
}
