package Numbers;
import java.util.Scanner;

public class Sum {
    public static int Sums(int n){
        if(n==0){
           // System.out.println(sum);
            return 0;
        }
        int ans = Sums(n-1);
        return ans+=n;
       // System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :-");
        int n = sc.nextInt();
        System.out.println(Sums(n));
        sc.close();
    }
}
