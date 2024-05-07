/*
Given a binary number as an integer N, convert it into decimal and print.
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
 */
import java.util.*;
public class Function4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = s.nextInt();
       int rem,sum=0,two=1;
       while(n!=0)
        {  
            rem=n%10;
            sum=sum+(rem*two);
            two=two*2;
            n=n/10;
        }   
        System.out.println(sum);    
        s.close();
    }
}
