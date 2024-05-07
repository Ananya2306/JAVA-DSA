/*
Given a number N, find its square root. 
You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2
 */
import java.util.*;

public class Function1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = s.nextInt();
        int root =1;
        for(int i=0;i<n/2;i++)
        {
            
            if((i*i)>n){
                root=i-1;
             break;
            }
        }
        
        System.out.print("The square root of the entered number :- "+root);
       s.close();
    }
}
