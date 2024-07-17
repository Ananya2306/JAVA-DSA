package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class FindFirstOccurRecursion {
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
    public static int FindFirstOccur(Node<Integer> head, int data, int pos){
        if(head==null) {
            return -1;
        }
        if(head.data == data) {
            return pos;
        }
        return FindFirstOccur(head.next, data, pos+1);
    }
    public static int HelperFuction(Node<Integer> head , int data) {
        return FindFirstOccur(head, data, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = TakeInput();
        int occur = HelperFuction(head,data);
        System.out.println(occur);
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