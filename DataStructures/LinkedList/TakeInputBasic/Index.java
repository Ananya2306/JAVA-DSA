package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class Index {
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
    public static int IndexPosition(Node<Integer> head, int n){
        Node<Integer> temp = head;
        int count = 0;
        while(temp!=null){
            if(temp.data==n){
               return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
		Node<Integer> node = TakeInput();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		IndexPosition(node,n);
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