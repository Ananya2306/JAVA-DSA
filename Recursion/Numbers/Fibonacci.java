package Numbers;
import java.util.Scanner;
/*
to	find nth Fibonacci number	.	In	Fibonacci	
series	to	calculate nth	Fibonacci number we	can	use	the	formula	F(n)=F(n– 1)+	
F(n	– 2)i.e. nth Fibonacci term	is	equal	to	sum	of	n-1	and	n-2
 */
public class Fibonacci {
    public static int Fibo(int n) {
        if(n==0 || n==1){
            return n;
        }
        int a=Fibo(n-1);
        int b=Fibo(n-2);
      return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        System.out.println(Fibo(n));
        sc.close();
    }
}
