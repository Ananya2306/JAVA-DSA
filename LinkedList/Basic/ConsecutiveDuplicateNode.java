package LinkedList.Basic;
/*
You have been given a singly linked list of integers 
where the elements are sorted in ascending order. 
Write a function that removes the consecutive duplicate values 
such that the given list only contains unique elements and 
returns the head to the updated list.

Sample Input 1 :
1
1 2 3 3 3 3 4 4 4 5 5 7 -1
Sample Output 1 :
1 2 3 4 5 7
 */
public class ConsecutiveDuplicateNode {
    public static Node<Integer> Duplicate(Node<Integer> head){
       Node<Integer> temp = head;
        while(temp!=null && temp.next!=null){
            if((temp.data) ==(temp.next.data)){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
            }
            return head;
        }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(3);
        Node<Integer> node5 = new Node<Integer>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //System.out.println(Duplicate(node1));
        Node<Integer> head = Duplicate(node1);
    
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}