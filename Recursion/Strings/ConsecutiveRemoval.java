package Strings;
import java.util.Scanner;

public class ConsecutiveRemoval {
/*
 Given a string S, remove consecutive duplicates from it recursively
 */
    public static String Remove(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return Remove(str.substring(1));
        }
        return str.charAt(0)+Remove(str.substring(1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.nextLine();
        System.out.println(Remove(str));
        sc.close();

    }
    
}


