import java.util.*;
public class Decimal {
/*
Given a decimal number (integer N), convert it into binary and print.
Sample Input 1 :
12
Sample Output 1 :
1100
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        int bin=0;
        int rem,rev=1;
        while(n>0){
            rem = n%2;
            n = n/2;
            bin = bin+rem*rev;
            rev = rev*10;
        }
        System.out.print(bin);
        sc.close();

    }
}
