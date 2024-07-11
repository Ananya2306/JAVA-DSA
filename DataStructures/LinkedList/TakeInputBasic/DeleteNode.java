package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class DeleteNode {
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
    public static Node<Integer> IndexRemove(Node<Integer> head,int pos){
    if(head==null){
        return head;
    }
    if(pos==0){
        return head.next;
    }
    Node<Integer> temp = head;
    int count =0;
    while(temp.next!=null){
        if(count==pos-1){
            temp.next = temp.next.next;
            return head;
        }
        if(temp.next==null || temp==null){
            return head;
        }
        count++;
        temp= temp.next; 
    }
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
    int n = sc.nextInt();
    Node<Integer> node = TakeInput();
        Node<Integer> x = IndexRemove(node,n);
        printList(x);
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