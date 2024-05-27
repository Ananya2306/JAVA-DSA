package Strings;

import java.util.Scanner;

/*
For a given input string(str), find and return the total number of words present in it.

It is assumed that two words will have only a single space in between. 
Also, there wouldn't be any leading and trailing spaces in the given input string.
 */
public class Words {
    public static int Count(String str){
        int count = 0;
        if(str.length()==0){
            return 0;
        }
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        } 
        return count+1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word or Sentence :- ");
        String str = sc.nextLine();
        int count = Count(str);
        System.out.println(count);
        sc.close();
    }
}
