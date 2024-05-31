package Strings;

import java.util.Scanner;
/* 
For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"

 Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
 All the characters in the string would be in lower case.
 */
public class ConsecutiveRemove {
    public static String Remove(String str){
        String rem = "";
        int start = 0;
        
        for(int i =0;i<str.length();i++){
        
            if(start!=str.charAt(i)){
                rem = rem + str.charAt(i);
                start = str.charAt(i);
            }
       
        }
    
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        System.out.println(Remove(str));
        sc.close();
    }
}
