package LinkedList.Basic;
import java.util.Scanner;
public class InputTaking1 {
	public static Node<Integer> TakeInput() {
		Node<Integer> head = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();//10
		while(data!=-1) {//-1 exit point =>user didn't took any data after this
			Node<Integer> newNode = new Node<Integer>(data);//10=>20=>30=>40=>50
			if(head==null) {
				head = newNode;//head =10 , not satisfy
			}else {
				Node<Integer> temp = head;//10=>20=>30=>40
				while(temp.next!=null) {//increment
					temp = temp.next;//20=>30=>40=>50
				}
				temp.next=newNode;//connection10=>20=>30=>40=>50
			}
			data = sc.nextInt();//To take new node, 20=>30=>40=>50=>-1(exit)
		}
		sc.close();
		return head;
	}
	public static void printList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Node<Integer> node = TakeInput();
		printList(node);

	}

}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}


