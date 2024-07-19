package LinkedList.Basic;
/*
Given a singly linked list of integers and an integer n, 
find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.

Follow a recursive approach to solve this.

Note :
Assume that the Indexing for the linked list always starts from 0.
 */
public class FirstOccurence {
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

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(30);
        Node<Integer> node3 = new Node<Integer>(30);
        Node<Integer> node4 = new Node<Integer>(40);
        Node<Integer> node5 = new Node<Integer>(50);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(NthNode(node1,30));
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
