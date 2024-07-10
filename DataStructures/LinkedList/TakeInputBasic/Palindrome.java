package LinkedList.TakeInputBasic;

import java.util.Scanner;

public class Palindrome {
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
    public static boolean isPalindrome(Node<Integer> head) {
        if(head == null || head.next == null) {
            return true;
        }
       
       Node<Integer> mid = Mid(head);// 3
       Node<Integer> head2 = mid.next;//4
       mid.next = null;//null
       Node<Integer> reverse = reverseList(head2);// 4
       while(head != null && reverse!=null){//node 1 && 1
        if(head.data!=reverse.data){//1!=4=> 2!=3
            return false;
        }else {
            head = head.next;// 2
        reverse = reverse.next;//3
        }
       }
       return true;

    }
    public static Node<Integer> Mid(Node<Integer> head){
        if(head==null){
            return null;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while(fast!=null&& fast.next!=null){//2 -3 => slow = node2 fast =node3 , 3-4 => slow = node3 fast => null
            slow = slow.next;
            fast = fast.next.next;
        }
        //fast = null soo slow will be print 
        return slow;// node 3

    }
    public static Node<Integer> reverseList(Node<Integer> head) {
        Node<Integer> prev = null;
        Node<Integer> curr = head;
        while(curr!=null) {// 4 => 3 => 2 => 1
            Node<Integer> nextTemp = curr.next;//3=>2=>1=> null
            curr.next = prev;//null//null
            prev = curr;//4=> 3 =>2=>1
            curr = nextTemp;//3 =>2=>1=>null
        }
        return prev;//1

    }
    public static void main(String[] args) {
		Node<Integer> node = TakeInput();
        System.out.print(isPalindrome(node));
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}