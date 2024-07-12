package LinkedList.TakeInputBasic;
/*
 * You have been given a singly linked list of integers along with an integer 'N'. 
 * Write a function to append the last 'N' nodes towards the front of the singly 
 * linked list and returns the new head to the list.
 */
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> Append(Node<Integer> head, int data) {
        Node<Integer> temp = head;
        int count =0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        //position where list will be split
        int newcount = count-data;
        // reuse in next loop
        count =0;
        //traverse node just before split point
        Node<Integer> temp2= head;
        while(count<newcount-1){ 
            temp2 = temp2.next;
            count++;
        }
        // saving  node at split point
        Node<Integer> temp3 = temp2.next;
        Node<Integer> temp4 = temp2.next;
        // last node in the list
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        //link last node to original head
        temp3.next = head;
        //break list at split point
        temp2.next = null;
        //return new head
        return temp4;
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
