package LinkedList.UserInput;

import java.util.Scanner;

public class Mid {
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
    public static int Midd(Node<Integer> head){
        if(head==null){
            return 0;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null&& fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       
        return slow.data;

    }
    public static void main(String[] args) {
		
		Node<Integer> node = TakeInput();
        System.out.print(Midd(node));
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
