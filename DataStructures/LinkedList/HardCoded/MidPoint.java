package LinkedList.HardCoded;

public class MidPoint {
    public static int Mid(Node<Integer> head){
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
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.print(Mid(node1));
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
