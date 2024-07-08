package Strings;

import java.util.Scanner;

/*
For a given input string(str), write a function to print all the possible substrings.

Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
 */
public class Substring {
    public static void Sub(String str){
        for(int i =0;i<str.length();i++){
            for(int j =i;j<str.length();j++){
              for(int k = i;k<=j;k++){
                System.out.print(str.charAt(k));
              }
              System.out.println();
            } 
        }
    }
    public static void Subs(String str){
        for(int i= 0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Subs(str);
        sc.close();
    }
}
