import java.util.*;
/*
 Create a function that determines whether a given number N belongs to the Fibonacci sequence. If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.
 Sample Input 1 :
5
Sample Output 1 :
true
Explanation :
Fibonacci sequence begins 0, 1, 1, 2, 3, 5, ... and so on. Since 5 appears in the sequence.
 */
public class Fibonacci{
    public static boolean checkNumber(int n) {
        int n1=1,n2=1,n3;
        while(n1<n){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        if(n1==n){
        return true;
        }else{
        return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkNumber(n));
        sc.close();
    }
    
}

