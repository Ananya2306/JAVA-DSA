package Strings;

import java.util.Scanner;

/*
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.

The input string will remain unchanged if the given character(X) doesn't exist in the input string.
 */
public class RemoveChar {
    public static String Removal(String str, char ch){
        String s = "";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                s = s + str.charAt(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        System.out.print("Enter the character :- ");
        char ch = sc.next().charAt(0);
        System.out.println(Removal(str,ch));
        sc.close();
    }
}
