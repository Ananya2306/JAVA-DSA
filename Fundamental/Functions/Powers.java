import java.util.*;
//import java.lang.Math;
/*
Write a program to find x to the power n (i.e. x^n). 
Take x and n from the user. 
You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
 */
public class Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int x = sc.nextInt();
        System.out.print("Enter x :- ");
        int n = sc.nextInt();
        int ans=1;
       // int ans = (int)Math.pow(n,x);
        //System.out.println(ans);
        int i=1;
       while(i<=n){
        ans = ans*x;
        i++;
       }
       System.out.println(ans);
       
        sc.close();
    }
}

