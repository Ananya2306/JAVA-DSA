package Strings;

import java.util.Scanner;

/* 
Given a string, determine if it is a palindrome, considering only alphanumeric characters.

Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" 
then as we see that this word can be read the same as forward and backwards, 
it is said to be a valid palindrome.

The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.
*/ 
public class Palindrome {

    public static boolean Palin(String str){
       int start =0;
       int end =str.length()-1;
       while(end > start){
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        start++;
        end --;
        
       }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.nextLine();
        System.out.println(Palin(str));
        sc.close();
    }
    
}
