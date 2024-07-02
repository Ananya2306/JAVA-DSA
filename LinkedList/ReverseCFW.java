package LinkedList;

import java.util.*;

public class ReverseCFW {
    public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       list.add("is");
       list.add("a");
       System.out.println(list);
       list.addLast("list");
       list.addFirst("this");
       System.out.println(list);
       list.add(3, "linked");
       System.out.println(list);


       System.out.println(list.size());   

       for(int i =0;i<list.size();i++){
        System.out.println(list.get(i)+ "->");
    }
    System.out.println("null");

       list.remove(3);
       list.removeFirst();
       list.removeLast();

       System.out.println(list);

       Collections.reverse(list);
   }
}
