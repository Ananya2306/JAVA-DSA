package LinkedList.HardCoded;

public class PrintNode {     
    public static void printList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
            printList(node1);
        }
    
    }
    class Node<T> {
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }
