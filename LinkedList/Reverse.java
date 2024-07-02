package LinkedList;

public class Reverse {
    Node head;
   // private int size;
   /*  Reverse() {
        this.size =0;
    }*/
    class Node {
        String data;
        Node next;
        //constructor
        Node(String data){
            this.data = data;
            // to create a node not a list
            this.next = null;
            
        }
    }
    /*first => 2 -> 3 -> 4->N
a new node 1 which point towards 2 soo list will be 
1 2 3 4 N*/
public void addFirst(String data){
    Node newNode = new Node(data);
// to know is there any Linked list exist ?
    if(head==null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head=newNode;

}
public void addLast(String data){
    Node newNode = new Node(data);
// to know is there any Linked list exist ?
if(head==null){
    head = newNode;
    return;
}
// never manipulate head and current node and making them traverse
Node currNode = head;
while(currNode.next!=null){
    currNode = currNode.next;
}
currNode.next = newNode;
}
public void printList(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+"-> ");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}
/*
 head =is -> a->n till null find last node 
 */
    /*
     linkedlist given
   head ->  1 2 3 4 N
     N 1 2 3 4 <-head 
     no extra memory
     space 0(1)
     time 0(n)
        prev    curr     next 
             <- node ->
             4->5->6 
             curr.next = prev 
             4<->5 6 (next)
            <-5(prev) 6(curr)->7(next) 
            curr.nect= prev
            4<-5<-6 7 (next)
     */
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }
 
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
 
    }
    /*
     * ll given 
     * 1 2 3 4 N 
     * we want
     * 2<-3<-4
     * head.next.next= head
     * 2    3           2      
     * head.next = null
     * return newhead
     * 1head 
     * 2 head 
     * 3 head
     * 4 head
     */
    public Node reverseRecursive(Node head){
        if(head == null || head.next ==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args){
       Reverse list = new Reverse();
       
        list.addFirst("a");
        list.addLast("is");
        list.addFirst("this");
        list.addLast("n");
        list.printList();
        list.reverseIterate();
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
