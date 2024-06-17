package Numbers;
import java.util.Scanner;

public class Factorial {
    //Given a number X,  print its factorial.
    public static int Fact(int n){
        if(n == 1) {
            return 1;
            }
       return n*Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :-");
        int n = sc.nextInt();
        System.out.println(Fact(n));
        sc.close();
    }
}
