package LinkedList.Basic;

public class IndexNode {
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
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        Node<Integer> node4 = new Node<Integer>(40);
        Node<Integer> node5 = new Node<Integer>(50);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(IndexPosition(node1, 30));
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}

