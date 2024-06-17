package Strings;
import java.util.Scanner;
//Given a string, compute recursively a new string where all 'x' chars have been removed.
public class RemoveChar {
    public static String Remove(String str){
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)=='x'){
            return Remove(str.substring(1));
        }
        return str.charAt(0)+Remove(str.substring(1));

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        System.out.println(Remove(str));
        sc.close();
    }
}
