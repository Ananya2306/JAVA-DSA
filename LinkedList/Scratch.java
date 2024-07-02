package LinkedList;

public class Scratch {
    Node head;
    private int size;
    Scratch() {
        this.size =0;
    }
    class Node {
        String data;
        Node next;
        //constructor
        Node(String data){
            this.data = data;
            // to create a node not a list
            this.next = null;
            size++;
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
/*
 head =is -> a->n till null find last node 
 */
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
    //delete first => make next node head 
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last => till 2nd last node and make them traverse
    /*
     a - b -c-N
     a = sl b = l 
     b = sl c = l
     when last null
     */
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;// head.next = null -> lastNode = null
        while(lastNode.next.next!=null){// null.next 
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
        public static void main(String[] args) {
            Scratch list = new Scratch();
            // add
            list.addFirst("a");
            list.addLast("is");
            list.addFirst("this");
            list.addLast("n");
            list.printList();
            //delete
            list.deleteFirst();
            list.printList();
            list.deleteLast();
            list.printList();
            //size
            System.out.println(list.getSize());

            }
    
}
