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
    
}
