package LinkedList;

/*
nth node from list + delete nth node

1->2->3->4->5->N
---->(size-n+1)
n<--------------

 1-> find size let be 5
let n= 2 s= 5
distance from start(dfs) => 5-2+1=4
hence , ---->4
4<-----
hence same node 
now delete this node 
to do this have access of its prev node
dfs prev => size-n ==> 5-2=3
(prev.next=prev.next.next)
 */
public class NnodeRemove {
    public class ListNode {
        // Definition for singly-linked list.
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head == null){
            return null;
        }
        //size
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next; 
            // if n is the last node, return the head of the remaining list.
        }
        // find prev node
        int indexToSearch = size-n;
        ListNode prev = head;
        int i =1;// since we r finding position
        while(i< indexToSearch){
            prev = prev.next;
            i++;
        }
        // remove nth node from end
        prev.next = prev.next.next;
        return head;
    }
       
    
    public static void main(String[] args) {
        NnodeRemove obj = new NnodeRemove();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);
        head = obj.removeNthFromEnd(head, 2);
        ListNode current = head;
        while (current!= null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
}
}
