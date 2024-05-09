import java.util.Scanner;
/*
 Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.



1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
 */
public class Alpha {
    public static void Alphabet(char ch) {
        if(ch>='A' && ch<='Z'){
            System.out.println("1");
        }else if(ch>='a' && ch<='z'){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Alphabet(ch);
        sc.close();
    }
}
