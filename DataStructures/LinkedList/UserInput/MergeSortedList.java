package LinkedList.UserInput;

import java.util.Scanner;

public class MergeSortedList {
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
		sc.close();// comment this before running
		return head;
	}
    public static void printList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static Node<Integer> Sort(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        //new head
        Node<Integer> newHead = null;
        //new Node => construct merge sort
        Node<Integer> newNode = null;
        //current
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        //data
        int data1 = head1.data;
        int data2 = head2.data;
        //compare => shifting
        if(data1>data2){
            newHead = temp2;
            temp2 = temp2.next;
        }else{
            newHead = temp1;
            temp1 = temp1.next;
        }
        newNode = newHead;
        //list merge , traverse
        while(temp1!=null&&temp2!=null){
            data1 = temp1.data;
            data2 = temp2.data;
            if(data1>data2){
                newNode.next = temp2;
                newNode = newNode.next;
                temp2 = temp2.next;
            }else {
                newNode.next = temp1;
                newNode = newNode.next;
                temp1 = temp1.next;
            }
        }
        // remaining nodes 
        if(temp1!=null){
            newNode.next = temp1;
        }
        if(temp2!=null){
            newNode.next = temp2;
        }
        return newHead;

    }

    public static void main(String[] args) { 
        Node<Integer> head1 = TakeInput();
        Node<Integer> head2 = TakeInput();
        /*Node<Integer> node1 = new Node<Integer>(2);
        Node<Integer> node2 = new Node<Integer>(5);
        Node<Integer> node3 = new Node<Integer>(8);
        Node<Integer> node4 = new Node<Integer>(11);
        Node<Integer> node5 = new Node<Integer>(15);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node<Integer> node6 = new Node<Integer>(3);
        Node<Integer> node7 = new Node<Integer>(6);
        Node<Integer> node8 = new Node<Integer>(9);
        Node<Integer> node9 = new Node<Integer>(13);
        Node<Integer> node10 = new Node<Integer>(17);
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;*/
        Node<Integer> mergedList = Sort(head1, head2);
        printList(mergedList);

    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
