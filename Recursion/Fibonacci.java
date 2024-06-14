import java.util.Scanner;

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
