package LinkedList.Basic;
/*
 You have been given a singly linked list of integers. Write a function to print the list in a reverse order.

To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
 */
public class Reverse {
    public static void Rev(Node<Integer> head){
       if(head == null){
        return;
       }
       //reverse -> rev(head.next);
       System.out.print(head.data + " ");
       //increasing order -> rev(head.next)
       Rev(head.next);
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Rev(node1);
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
