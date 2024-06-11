import java.util.Scanner;

public class Power {
    public static int Pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*Pow(x, n-1);
    }
    /*
     n= 2
     x = 2
     unsatis
     2*pow(2,1)
     x=2
     n=1
     unsatis
     2*pow(2,0)
     x=2
     n=0
     satis
     return 1
     2*2
     4
     */
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
