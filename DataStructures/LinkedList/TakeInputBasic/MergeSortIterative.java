package LinkedList.TakeInputBasic;

//import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortIterative {
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
		return head;
	}
    public static void printList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node<Integer> MergeSort(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> mid = Mid(head);
        Node<Integer> midNext = mid.next;
        mid.next = null;
        Node<Integer> temp1 = MergeSort(head);
        Node<Integer> temp2 = MergeSort(midNext);
        return Merge(temp1, temp2);
    }

    public static Node<Integer> Merge(Node<Integer> head1, Node<Integer> head2) {
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

    public static Node<Integer> Mid(Node<Integer> head) {
        if(head==null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        head = MergeSort(head);
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