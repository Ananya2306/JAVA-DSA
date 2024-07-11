package LinkedList.TakeInputBasic;
/*
You have been given a singly linked list of integers, 
an integer value called 'data' and a position with the name 'pos.'
Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
Note :
Assume that the Indexing for the singly linked list always starts from 0
 */
import java.util.Scanner;

public class AddNode {
    public static Node<Integer> TakeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {//-1 exit point =>user didn't took any data after this
			Node<Integer> newNode = new Node<Integer>(data);//10=>20=>30=>40=>50
			if(head==null) {
				head = newNode;
				tail=newNode;
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = sc.nextInt();//To take new node, 20=>30=>40=>50=>-1(exit)
		}
		sc.close();
		return head;
	}
    public static Node<Integer> Add(Node<Integer> head,int pos,int data){
		Node<Integer> newNode = new Node<Integer>(data);
		Node<Integer> temp = head;
		
		if(head==null){
			return head;
		}
		if(pos==0){
			newNode.next = head;
            return newNode;
		}
		int count =0;
		while(temp.next!=null){
			if(count==pos-1){
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            count++;
            temp = temp.next;
		}

		newNode.next = temp.next;
		temp.next = newNode;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
		int num = sc.nextInt();
        Node<Integer> node = TakeInput();
		Node<Integer> x =Add(node,pos,num);
		printList(x);
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