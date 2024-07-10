package LinkedList;
/*
 1->2->1->N
 -->    <--
 1->2->2->1->N
 -->    <--
 IF YES => True
 IF NO => False
 make an arr[]
 make LL reverse
 1->2->1
 1<-2<-1 
"issue" => we use space extra

soo 
1->2->2->1
2nd half reverse 
(head)1->2    null<-2<-1(new  head)
1 compare 1
2 compare 2
null can't be compared

 */


/*
  MAIN 3 STEPS
  1. MIDDLE OF LL
  2. REVERSE SECOND HALF
  3. COMPARE BOTH HALFS 
  */
public class PalindromeList {
  public class ListNode {
    // Definition for singly-linked list.
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
    public ListNode getMiddle(ListNode head) {
   ListNode fast = head;
   ListNode slow = head;
   while (fast.next != null && fast.next.next != null) {
       fast = fast.next.next;
       slow = slow.next;
   }
   return slow;
}
public ListNode reverse(ListNode head) {
  ListNode prev = null;
  ListNode curr = head;
 
  while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
 }
 public boolean isPalindrome(ListNode head) {
  if(head == null || head.next == null) {
      return true;
  }
 
  ListNode firstHalfEnd = getMiddle(head);
  ListNode secondHalfStart = reverse(firstHalfEnd.next);
  ListNode firstHalfStart = head;
 
  while(secondHalfStart != null) {
      if(secondHalfStart.val != firstHalfStart.val) {
          return false;
      }
      secondHalfStart = secondHalfStart.next;
      firstHalfStart = firstHalfStart.next;
  }
 
  return true;
}
public static void main(String[] args) {
  PalindromeList obj = new PalindromeList();
  ListNode head = obj.new ListNode(1);
  head.next = obj.new ListNode(2);
  head.next.next = obj.new ListNode(3);
  head.next.next.next = obj.new ListNode(4);
  head.next.next.next.next = obj.new ListNode(5);
  System.out.println(obj.isPalindrome(head)); // should return false
}

}


