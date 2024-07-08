package Strings;
import java.util.Scanner;

public class Palindrome {
    /*
     Determine if a given string ‘S’ is a palindrome using recursion. 
     Return a Boolean value of true if it is a palindrome and false if it is not.
     
     */
    public static boolean Palin(String str){
        return HelperFunction(str,0,str.length()-1);
    }
    public static boolean HelperFunction(String str, int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return HelperFunction(str,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Palin(str));
        sc.close();
    }
}
