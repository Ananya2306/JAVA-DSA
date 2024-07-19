package LinkedList.UserInput;
//Given a singly linked list of integers, sort it using 'Merge Sort.'
import java.util.Scanner;

public class MergeSortRecursion {
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
    
    public static Node<Integer> mergeSort(Node<Integer> head) {
        //base case
        if (head == null || head.next == null) {
            return head;
        }
        //find middle
        Node<Integer> middle = getMiddle(head);
        //split
        Node<Integer> nextToMiddle = middle.next;
        
        middle.next = null;
        // call 
        Node<Integer> left = mergeSort(head);
        Node<Integer> right = mergeSort(nextToMiddle);
        //merge
        return merge(left, right);
        }
        //middle point
    public static Node<Integer> getMiddle(Node<Integer> head) {
        
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;

        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public static Node<Integer> merge(Node<Integer> left, Node<Integer> right) {
        Node<Integer> result = null;
        //base case
        if (left == null)
            return right;
        else if (right == null)
            return left;
        // compare
        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    
    public static void main(String[] args) { 
        Node<Integer> head = TakeInput();
        head = mergeSort(head);
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

