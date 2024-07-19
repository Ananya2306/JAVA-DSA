package LinkedList.UserInput;

import java.util.Scanner;

public class FirstOccur {
    public static int NthNode(Node<Integer> head, int n) {
        return Helper(head, 0, n);
    }
    public static int Helper(Node<Integer> head, int position,int n){
        if(head == null) {
            return -1;
        }
        if(head.data == n) {
            return position;
        }
        return Helper(head.next,position+1 ,n);
    }
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
    public static void main(String[] args) {
		Node<Integer> node = TakeInput();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		NthNode(node,n);
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