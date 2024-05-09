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
        int a=1,b=1,c=0,f=0;
        for(int i=0;c<2*n;i++)
        {
            c=a+b;
            if(n==c)
                f=1;
            a=b;
            b=c;
        }
        if(f==1)
        
        return true;
    
    else
        
        return false;
    }
    public static void main(String args[]){
        int n;
        Scanner snr= new Scanner(System.in);
        n=snr.nextInt();
        snr.close();
        System.out.println(checkNumber(n));
    }
    
}

