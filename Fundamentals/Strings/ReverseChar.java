package Strings;
import java.util.Scanner;
/*
 Aadil has been provided with a sentence in the form of a string as a function parameter. 
 The task is to implement a function so as to change the sentence such that each word in the sentence is reversed. 
 A word is a combination of characters without any spaces.

Example:
Input Sentence: "Hello I am Aadil"
The expected output will look, "olleH I ma lidaA".
 */
public class ReverseChar {
   
    public static String Reverse(String str, int start,int end){
        String rev = "";
        while(start<end){
            rev =str.charAt(start)+rev;
            start++;
        }
        return rev;
    }

    public static String Rev(String str){
        int n = str.length();
        int index = -1;
        String rev = "";
        int i =0;
        for(;i<n;i++){
            if(str.charAt(i)==' '){
                rev = rev + Reverse(str, index+1, i)+" ";
                index = i;
            }
        }
        rev = rev+Reverse(str,index+1,i)+" ";
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        System.out.println(Rev(str));
        sc.close();
    }
}
