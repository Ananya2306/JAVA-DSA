package Strings;

import java.util.Scanner;

/*
Reverse the given string word wise.
That is, the last word in given string should come at 1st place, 
last second word at 2nd place and so on.
Individual words should remain as it is.
 */
public class ReverseWord {
    public static String ReverseString(String str){
       int end = str.length();
       int start = str.length()-1;
       String rev = "";
       while(start>=0){
        if(str.charAt(start)==' '){
        rev = rev+str.substring(start+1,end)+" ";
        end = start;
        }
        start--;
       }
       rev = rev+str.substring(start+1,end);
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        System.out.println(ReverseString(str));
        sc.close();
    }
}
