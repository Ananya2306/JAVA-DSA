package Numbers;
import java.util.Scanner;
/*
 Write a program to find x to the power n (i.e. x^n). 
 Take x and n from the user. 
 You need to return the answer.
 */
public class Power {
    public static int Pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*Pow(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int x = sc.nextInt();
        System.out.print("Enter the power :- ");
        int n = sc.nextInt();
        System.out.println(Pow(x, n));
        sc.close();
    }
}
