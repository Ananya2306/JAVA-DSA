package Strings;
import java.util.Scanner;
/*
 Given a string S, compute recursively a new string where 
identical chars that are adjacent in the original string are separated from each other by a "*".
 */
public class IdenticalChars {
    public static String Identical(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+"*"+Identical(str.substring(1));
        }else{
            return str.charAt(0)+Identical(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.next();
        System.out.println(Identical(str));
        sc.close();
    }
}
